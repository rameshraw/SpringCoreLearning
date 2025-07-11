package com.ramesh.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciConfig.xml");
        Person person = (Person) context.getBean("person1");
        System.out.println(person);
        AmbiguityProblem addition = (AmbiguityProblem) context.getBean("add");
        addition.dosum();
    }
}
