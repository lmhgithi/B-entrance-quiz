package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Group;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class StudentRepository {
    static private List<Student> students = new ArrayList<Student>() {
        {
            add(new Student(1, "沈乐棋"));
            add(new Student(2, "徐慧慧"));
            add(new Student(3, "陈思聪"));
            add(new Student(4, "王江林"));
            add(new Student(5, "王登宇"));
            add(new Student(6, "杨思雨"));
            add(new Student(7, "江雨舟"));
            add(new Student(8, "廖燊"));
            add(new Student(9, "胡晓"));
            add(new Student(10, "但杰"));
            add(new Student(11, "盖迈达"));
            add(new Student(12, "肖美琦"));
            add(new Student(13, "黄云洁"));
            add(new Student(14, "齐瑾浩"));
            add(new Student(15, "刘亮亮"));
            add(new Student(16, "肖逸凡"));
            add(new Student(17, "王作文"));
            add(new Student(18, "郭瑞凌"));
            add(new Student(19, "李明豪"));
            add(new Student(20, "党泽"));
            add(new Student(21, "肖伊佐"));
            add(new Student(22, "贠晨曦"));
            add(new Student(23, "李康宁"));
            add(new Student(24, "马庆"));
            add(new Student(25, "商婕"));
            add(new Student(26, "余榕"));
            add(new Student(27, "谌哲"));
            add(new Student(28, "董翔锐"));
            add(new Student(29, "陈泰宇"));
            add(new Student(30, "赵允齐"));
            add(new Student(31, "张柯"));
            add(new Student(32, "廖文强"));
            add(new Student(33, "刘轲"));
            add(new Student(34, "廖浚斌"));
            add(new Student(35, "凌凤仪"));
        }
    };
    static private List<Student> studentsOrigin = new ArrayList<Student>() {
        {
            add(new Student(1, "沈乐棋"));
            add(new Student(2, "徐慧慧"));
            add(new Student(3, "陈思聪"));
            add(new Student(4, "王江林"));
            add(new Student(5, "王登宇"));
            add(new Student(6, "杨思雨"));
            add(new Student(7, "江雨舟"));
            add(new Student(8, "廖燊"));
            add(new Student(9, "胡晓"));
            add(new Student(10, "但杰"));
            add(new Student(11, "盖迈达"));
            add(new Student(12, "肖美琦"));
            add(new Student(13, "黄云洁"));
            add(new Student(14, "齐瑾浩"));
            add(new Student(15, "刘亮亮"));
            add(new Student(16, "肖逸凡"));
            add(new Student(17, "王作文"));
            add(new Student(18, "郭瑞凌"));
            add(new Student(19, "李明豪"));
            add(new Student(20, "党泽"));
            add(new Student(21, "肖伊佐"));
            add(new Student(22, "贠晨曦"));
            add(new Student(23, "李康宁"));
            add(new Student(24, "马庆"));
            add(new Student(25, "商婕"));
            add(new Student(26, "余榕"));
            add(new Student(27, "谌哲"));
            add(new Student(28, "董翔锐"));
            add(new Student(29, "陈泰宇"));
            add(new Student(30, "赵允齐"));
            add(new Student(31, "张柯"));
            add(new Student(32, "廖文强"));
            add(new Student(33, "刘轲"));
            add(new Student(34, "廖浚斌"));
            add(new Student(35, "凌凤仪"));
        }
    };

    static List<String> teamName = new ArrayList<String>() {
        {
            add("Team 1");
            add("Team 2");
            add("Team 3");
            add("Team 4");
            add("Team 5");
            add("Team 6");
        }
    };

    static private List<Group> studentsGroup;


    public List<Student> getStudents() {
        return students;
    }

    public List<Student> getStudentsOrigin() {
        return studentsOrigin;
    }

    public List<String> getTeamName() {
        return teamName;
    }

    public List<Group> getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(List<Group> studentsGroup) {
        StudentRepository.studentsGroup = studentsGroup;
    }



    public Student findStudentsByIndex(Integer index) {
        return students.get(index);
    }

    public void shuffleStudents() {
        Collections.shuffle(students);
    }

}
