package com.skye.homework.week5.q3;

import lombok.Data;

import java.util.List;

@Data
public class Klass {
    private int id;

    private String name;

    private List<Student> students;

    public void dong(){
        System.out.println(this.getStudents());
    }
}
