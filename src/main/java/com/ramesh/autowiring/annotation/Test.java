package com.ramesh.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireAnnotationConfig.xml");
        Address address = context.getBean("address2", Address.class);
        System.out.println(address.getName());

        Employee emp = context.getBean("employee", Employee.class);
        System.out.println(emp);
    }
}
