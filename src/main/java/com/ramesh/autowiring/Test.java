package com.ramesh.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireConfig.xml");
        Employee emp = context.getBean("employee",Employee.class);
        System.out.println(emp);
    }
}
