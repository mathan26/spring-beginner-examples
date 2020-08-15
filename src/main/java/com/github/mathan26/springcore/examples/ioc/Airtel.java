package com.github.mathan26.springcore.examples.ioc;

public class Airtel implements Sim {

    public Airtel() {
        System.out.println("Spring created bean for Airtel class");
    }

    @Override
    public void call() {
        System.out.println("Calling Using Airtel Sim...");
    }

    @Override
    public void data() {
        System.out.println("Browsing Using Airtel Sim..");
    }
}

