package com.github.mathan26.springcore.examples.spring_core_annotation.javaconfig;

import com.github.mathan26.springcore.examples.spring_core_annotation.component.College;
import com.github.mathan26.springcore.examples.spring_core_annotation.component.CollegeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NoXmlConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
       /* MyCollege college = context.getBean("javaBean",MyCollege.class);
        System.out.println(college);*/



        MyCollege javaBeanExample=context.getBean("javaBean", MyCollege.class);
        javaBeanExample.test();
    }
}
