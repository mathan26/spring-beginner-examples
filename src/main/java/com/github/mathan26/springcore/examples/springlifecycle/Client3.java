package com.github.mathan26.springcore.examples.springlifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Client3 {

    public void print(){
        System.out.println(this.hashCode());
    }

}
