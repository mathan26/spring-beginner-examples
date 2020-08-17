package com.github.mathan26.springcore.examples.injectingliteral;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = context.getBean("obj1",Student.class);
        System.out.println(student);

        AnnotationExample student2 = context.getBean("obj2",AnnotationExample.class);
        System.out.println(student2);
    }
}

