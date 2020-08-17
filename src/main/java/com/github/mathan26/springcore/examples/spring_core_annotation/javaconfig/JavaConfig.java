package com.github.mathan26.springcore.examples.spring_core_annotation.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.github.mathan26.springcore.examples.spring_core_annotation")
@PropertySource("classpath:college-info.properties")
public class JavaConfig {

    @Bean
    public Principal principal(){
        return new Principal();
    }

    @Bean(name = {"javaBean","anyName"})
    public MyCollege getJavaBeanExample(){
        return new MyCollege(principal());
    }
}
