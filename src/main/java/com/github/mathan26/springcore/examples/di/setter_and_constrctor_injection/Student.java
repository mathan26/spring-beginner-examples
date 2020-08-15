package com.github.mathan26.springcore.examples.di.setter_and_constrctor_injection;

import com.github.mathan26.springcore.examples.di.setter_and_constrctor_injection.loosecoupling.Cheat;

public class Student {

    //SPRING ALSO helps us to manage the dependencies

    private int id;
    private String studentName;


    Cheat mathCheat;

    // OBJECT INJECTION BY SETTER
    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public Student() {
    }

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Spring Using SETTER method for Injecting the value...");
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void displayStudentDetails(){
        System.out.println("Student name is: "+ getStudentName()+" and the Id is: "+getId());
    }

    public void cheating(){
        mathCheat.cheating();
    }
}
