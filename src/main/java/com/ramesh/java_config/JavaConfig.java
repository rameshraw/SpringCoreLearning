package com.ramesh.java_config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JavaConfig {
    @Bean(name = "student")
    public Student getstudent(){
        return new Student( getCourses());
    }
    @Bean
    public  Courses getCourses(){
        return  new Courses();
    }


}
