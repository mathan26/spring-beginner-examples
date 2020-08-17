package com.github.mathan26.springcore.examples.injectingliteral;

public class Student {
    private String name;
    private String interestCourse;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterestCourse() {
        return interestCourse;
    }

    public void setInterestCourse(String interestCourse) {
        this.interestCourse = interestCourse;
    }

    public String getHobby() {
        return hobby;
    }

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
