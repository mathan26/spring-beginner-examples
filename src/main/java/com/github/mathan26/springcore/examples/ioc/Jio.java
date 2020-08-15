package com.github.mathan26.springcore.examples.ioc;

public class Jio implements Sim {
    public Jio() {
        System.out.println("Spring created bean for Jio class");
    }

    @Override
    public void call() {
        System.out.println("Calling Using Jio Sim...");
    }

    @Override
    public void data() {
        System.out.println("Browsing Using Jio Sim..");
    }
}
