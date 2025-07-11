package com.ramesh.java_config;

import org.springframework.stereotype.Component;


public class Student {
    private Courses courses;

    public Student() {
    }

    public Student(Courses courses) {
        this.courses = courses;
    }

    public void study(){
        System.out.println(" Student is studying"+this.courses.getName());
    }
}
