package com.github.mathan26.springcore.examples.injectingliteral;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class AnnotationExample {
    private String name;
    private String interestCourse;
    private String hobby;

    public String getName() {
        return name;
    }

    @Value("Vishal")
    public void setName(String name) {
        this.name = name;
    }

    public String getInterestCourse() {
        return interestCourse;
    }

    @Required
    @Value("${student.interestCourse}")
    public void setInterestCourse(String interestCourse) {
        this.interestCourse = interestCourse;
    }


    public String getHobby() {
        return hobby;
    }

    @Value("Tennis")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", interestCourse='" + interestCourse + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
