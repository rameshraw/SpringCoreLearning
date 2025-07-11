package com.ramesh.lifecycle;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleConfig.xml");
        Samosa samosa = (Samosa) context.getBean("samosa");
        System.out.println(samosa);
        Pessi pessi = (Pessi) context.getBean("pessi");
        Chiya chiya = (Chiya) context.getBean("chiya");
        System.out.println(pessi);
        System.out.println(chiya);
        context.registerShutdownHook();
    }
}
