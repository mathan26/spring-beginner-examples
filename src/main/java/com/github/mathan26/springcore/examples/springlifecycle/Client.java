package com.github.mathan26.springcore.examples.springlifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        LifeCycleDemo lifeCycleDemo = context.getBean("lifeCycleDemo",LifeCycleDemo.class);
        lifeCycleDemo.display();

        context.registerShutdownHook();
//        context.close();
//
        LifeCycleDemo2 lifeCycleDemo2 = context.getBean("lifeCycleDemo2",LifeCycleDemo2.class);
        lifeCycleDemo2.display();


    }
}
