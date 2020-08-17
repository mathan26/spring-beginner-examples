package com.github.mathan26.springcore.examples.spring_core_annotation.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class MyCollege {

    @Value("${MyCollege.name}")
    String collegeName;

    @Autowired
    Principal principal;

    @Autowired
    Teacher teacher;

    public MyCollege(Principal principal) {
        this.principal = principal;
    }
    public void test(){
        System.out.println("My College Name: "+collegeName);
        principal.principalInfo();
        teacher.Teach();

        System.out.println("test method called!");
    }
}
