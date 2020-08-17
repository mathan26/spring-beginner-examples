package com.github.mathan26.springcore.examples.spring_core_annotation.javaconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component

//@Profile({"B","default"})
public class MathTeacher implements  Teacher {
    @Override
    public void Teach() {
        System.out.println("Teaching maths");
    }
}
