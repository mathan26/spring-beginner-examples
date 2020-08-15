package com.github.mathan26.springcore.examples.di.setter_and_constrctor_injection;

import com.github.mathan26.springcore.examples.di.setter_and_constrctor_injection.loosecoupling.Cheat;

public class ScienceCheat implements Cheat {
    public ScienceCheat() {
    }

    public void cheating(){
        System.out.println("Science cheat started...");
    }
}
