package com.github.mathan26.springcore.examples.ioc;

public class Vodafone implements Sim {

    public Vodafone() {
        System.out.println("Spring creates bean for Vodafone class");
    }

    @Override
    public void call() {
        System.out.println("Calling Using Vodafone Sim...");
    }

    @Override
    public void data() {
        System.out.println("Browsing Using Vodafone Sim..");
    }
}
