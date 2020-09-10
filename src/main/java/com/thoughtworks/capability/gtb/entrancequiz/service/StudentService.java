package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Group;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.repository.StudentRepository;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.*;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    static int cur = 35;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.getStudentsOrigin();
    }

    public List<Group> getStudentsGroup() {
        initGroup();
        studentRepository.shuffleStudents();
        int perGroup = studentRepository.getStudents().size() / 6;
        int restToAdd = 0;
        if (perGroup * 6 < cur) {
            restToAdd = cur - perGroup * 6;
        }

        int total = 0;
        for (int i = 0; i < 6; i += 1) {
            List<Student> tmp = new ArrayList<>();
            int tmpAdd = restToAdd > 0 ? perGroup + 1 : perGroup;
            for (int j = 0; j < tmpAdd; j += 1) {
                if (total <= cur) {
                    tmp.add(studentRepository.findStudentsByIndex(i * perGroup + j));
                    total += 1;
                }
            }
            restToAdd -= 1;
            Group eachGroup = new Group(studentRepository.getTeamName().get(i), tmp);
            studentRepository.getStudentsGroup().add(eachGroup);
        }

        return studentRepository.getStudentsGroup();
    }

    private void initGroup() {
        studentRepository.setStudentsGroup(new ArrayList<>());
    }


    public void addStudent(String name) {
        cur += 1;
        Student studentToAdd = new Student(cur, name);
        studentRepository.getStudentsOrigin().add(studentToAdd);
        studentRepository.getStudents().add(studentToAdd);
    }

    public void changeTeamName(String originName, String name) throws Exception {
        if (Collections.frequency(studentRepository.getTeamName(), name) > 0) {
            throw new InvalidParameterException();
        } else {
            studentRepository.getTeamName().set(studentRepository.getTeamName().indexOf(originName), name);
        }
    }
}
