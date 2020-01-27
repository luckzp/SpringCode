package com.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanLifeCycle {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Bike bike(){
        System.out.println("=== create ===");
        Bike bike = new Bike();
        System.out.println(bike);
        return bike;
    }
}
