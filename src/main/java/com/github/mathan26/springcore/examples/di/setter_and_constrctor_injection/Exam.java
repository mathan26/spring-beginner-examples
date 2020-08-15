package com.github.mathan26.springcore.examples.di.setter_and_constrctor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        System.out.println("*****SETTER INJECTION*******");
        Student student1 = context.getBean("student1",Student.class);
        student1.displayStudentDetails();

        Student student2 = context.getBean("student2",Student.class);
        student2.displayStudentDetails();

        System.out.println("*****CONSTRUCTOR INJECTION*******");

        Student student3 = context.getBean("student3",Student.class);
        student3.displayStudentDetails();


        Student student4 = context.getBean("student4",Student.class);
        student4.displayStudentDetails();

        System.out.println("*****OBJECT INJECTION*******");

        Student student5 = context.getBean("student5",Student.class);
        student5.cheating();

        AnotherStudent student6 = context.getBean("student6",AnotherStudent.class);
        student6.cheating();

        //We
        Student specialstudent = context.getBean("specialstudent",Student.class);
        specialstudent.cheating();

    }
}
