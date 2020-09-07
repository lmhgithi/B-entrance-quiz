package com.thoughtworks.capability.gtb.entrancequiz.domain;

//@Data
public class Student {
    private Integer num;
    private String name;

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}