package com.github.mathan26.springcore.examples.di.autowired_and_qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        Human humanHeart = context.getBean("human",Human.class);
        humanHeart.startPumping();

        Human humanObject = context.getBean("humanObject",Human.class);
        humanObject.startPumping();

        Human humanObject2 = context.getBean("humanObject2",Human.class);
        humanObject2.startPumping();

        Alien alien = context.getBean("alien",Alien.class);
        alien.startPumping();

    }
}
