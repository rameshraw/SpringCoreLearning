package com.ramesh;

import com.ramesh.collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        Student student1= (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        Student student3 = (Student) context.getBean("student3");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        ApplicationContext employeecontext  =new ClassPathXmlApplicationContext("collectionsConfig.xml");
        Employee employee =(Employee) employeecontext.getBean("employee1");
        System.out.println(employee.getPhones().getClass().getName());
    }

}
