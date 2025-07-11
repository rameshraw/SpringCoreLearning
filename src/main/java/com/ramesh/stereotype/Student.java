package com.ramesh.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Scope("prototype")
@Component("student1")
public class Student {
    @Value("01")
    private int id;
    @Value("Ramesh Rawal")
    private String name;
    @Value("#{addresses}")
    private List<String> address;

    public Student() {
    }

    public Student(int id, String name, ArrayList<String> address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("setting the student id ");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setting the student name");
        this.name = name;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        System.out.println("setting the student address");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
