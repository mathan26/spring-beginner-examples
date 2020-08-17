package com.github.mathan26.springcore.examples.spring_core_annotation.javaconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Profile("A")
public class ScienceTeacher implements  Teacher {
    @Override
    public void Teach() {
        System.out.println("Teaching Science ");
    }
}
