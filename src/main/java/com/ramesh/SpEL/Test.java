package com.ramesh.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spelConfig.xml");
        Demo demo = context.getBean("demo", Demo.class);
        System.out.println(demo.getE());
        System.out.println(demo.getName());
        System.out.println(demo.isIslogin());
        System.out.println();
        SpelExpressionParser parser = new SpelExpressionParser();
         Expression expression = parser.parseExpression("4/7+5-4");
        System.out.println(expression.getValue());


    }
}
