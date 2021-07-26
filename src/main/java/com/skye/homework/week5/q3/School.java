package com.skye.homework.week5.q3;

import lombok.Data;

@Data
public class School {

    private int id;

    private String name;

    private Klass class1;

    private Student student100;

    public void ding(){
        System.out.println("······································");
        System.out.println("Class1 have " + this.class1.getStudents().size() + " students and one is " + this.student100);

    }
}
