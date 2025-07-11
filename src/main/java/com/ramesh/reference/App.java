package com.ramesh.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refConfig.xml");
        A a =(A) context.getBean("aref");
        A a1 =(A) context.getBean("aref1");

        System.out.println(a.getX());
        System.out.println(a.getObj());
        System.out.println(a1.getX() +"\n"+a1.getObj().getY());
    }
}
