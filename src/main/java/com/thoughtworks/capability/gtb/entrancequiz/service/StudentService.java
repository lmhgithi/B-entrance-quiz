package com.thoughtworks.capability.gtb.entrancequiz.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    static public Map<Integer, String> students = new HashMap<Integer, String>(){
        {
            put(1, "沈乐棋");
            put(2, "徐慧慧");
            put(3, "陈思聪");
            put(4, "王江林");
            put(5, "王登宇");
            put(6, "杨思雨");
            put(7, "江雨舟");
            put(8, "廖燊");
            put(9, "胡晓");
            put(10, "但杰");
            put(11, "盖迈达");
            put(12, "肖美琦");
            put(13, "黄云洁");
            put(14, "齐瑾浩");
            put(15, "刘亮亮");
            put(16, "肖逸凡");
            put(17, "王作文");
            put(18, "郭瑞凌");
            put(19, "李明豪");
            put(20, "党泽");
            put(21, "肖伊佐");
            put(22, "贠晨曦");
            put(23, "李康宁");
            put(24, "马庆");
            put(25, "商婕");
            put(26, "余榕");
            put(27, "谌哲");
            put(28, "董翔锐");
            put(29, "陈泰宇");
            put(30, "赵允齐");
            put(31, "张柯");
            put(32, "廖文强");
            put(33, "刘轲");
            put(34, "廖浚斌");
            put(35, "凌凤仪");
        }
    };

    public Map<Integer, String> getStudents() {
        return students;
    }
}
