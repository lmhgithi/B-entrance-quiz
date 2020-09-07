package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    static int cur = 35;
    static public List<Student> students = new ArrayList<Student>(){
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

    static public Map<String, List<Student>> studentsGroup;

    public List<Student> getStudents() {
        return students;
    }

    public Map<String, List<Student>> getStudentsGroup() {
        initGroup();
        int perGroup = students.size()/6;
        int restToAdd = 0;
        if(perGroup*6 < cur) {
            restToAdd = cur - perGroup*6;
        }

        int total = 0;
        for(int i = 0; i < 6; i+=1){
            List<Student> tmp = new ArrayList<>();
            int tmpAdd = restToAdd>0 ? perGroup+1 : perGroup;
            for(int j = 0; j < tmpAdd; j+=1){
                if(total <= cur) {
                    tmp.add(students.get(i * perGroup + j));
                    total += 1;
                }
            }
            restToAdd -= 1;
            studentsGroup.put("Team " + i+1, tmp);
        }

        return studentsGroup;
    }

    private void initGroup() {
        studentsGroup = new HashMap<String, List<Student>>();
    }


}
