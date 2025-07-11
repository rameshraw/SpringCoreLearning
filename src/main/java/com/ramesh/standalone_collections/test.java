package com.ramesh.standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("standaloneConfig.xml");
    Person person = context.getBean("person",Person.class);

        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println(person.getFeeStructure());
        System.out.println(person.getFeeStructure().getClass().getName());
    }

}
