package com.github.mathan26.springcore.examples.di.setter_and_constrctor_injection;

import com.github.mathan26.springcore.examples.di.setter_and_constrctor_injection.loosecoupling.Cheat;

public class MathCheat implements Cheat {
    public MathCheat() {
        System.out.println("Two different Object created "+ this.hashCode());
    }

    public void cheating(){
        System.out.println("Math cheat started...");
    }
}
