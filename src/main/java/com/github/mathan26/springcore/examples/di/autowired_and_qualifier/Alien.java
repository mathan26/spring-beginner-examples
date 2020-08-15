package com.github.mathan26.springcore.examples.di.autowired_and_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Alien {

    @Autowired
    @Qualifier("alienHeart")
    Heart heart;

    public Alien() {
    }


    public Alien(Heart heart) {
        this.heart = heart;
    }

    public void  startPumping(){
        heart.pump();
    }
}
