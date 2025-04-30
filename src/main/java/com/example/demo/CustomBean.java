package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CustomBean {
    public void doSomething() {
        System.out.println("printing from bean");
    }
}
