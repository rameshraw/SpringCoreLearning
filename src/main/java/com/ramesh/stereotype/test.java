package com.ramesh.stereotype;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeConfig.xml");
    Student student = context.getBean("student1",Student.class);
    Student student2 = context.getBean("student1",Student.class);
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student);
    }

}
