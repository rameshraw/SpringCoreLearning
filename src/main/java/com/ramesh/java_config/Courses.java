package com.ramesh.java_config;

import org.springframework.beans.factory.annotation.Value;

public class Courses {
    @Value("Java")
    private String name;
    public Courses(String name) {
        this.name = name;
    }

    public Courses() {
    }

    @Override
    public String toString() {
        return "Courses{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
