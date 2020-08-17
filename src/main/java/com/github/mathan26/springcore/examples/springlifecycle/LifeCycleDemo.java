package com.github.mathan26.springcore.examples.springlifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class LifeCycleDemo {


    Client3 client3;
    Client2 client2;

    public LifeCycleDemo(Client3 client3, Client2 client2) {
        this.client3 = client3;
        this.client2 = client2;
    }

    public void display(){
        System.out.println("Display method called!");
        client2.print();
        client3.print();
    }

    @PostConstruct
    public void preInitialize(){
        System.out.println("You can do some Initialization process here ...");
    }


    @PreDestroy
    public void preDestroy(){
        System.out.println("you can do some clean up activities");
    }
}
