package com.github.mathan26.springcore.examples.di.autowired_and_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    Heart heart;

    public Human() {
    }

    public Human(Heart heart) {
        this.heart = heart;
    }


    @Autowired
    @Qualifier("humanHeart")
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startPumping(){
        if (heart!=null){
            heart.pump();
        }else {
            System.out.println("Heart stopped pumping!!!!");
        }
    }
}
