package com.github.mathan26.springcore.examples.spring_core_annotation.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college=context.getBean("college",College.class);
        college.display();
        System.out.println(college);
    }
}
