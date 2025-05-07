package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InfoPrinter {
    @Value("${app.year}")
    private int year;
    @Value("${app.name}")
    private String name;

    @Value("${app.random}")
    private String random;
    public void displayInfo() {
        System.out.println(year + "!!!!!!!!!!!!");
        System.out.println("name: " + name + " - random: " + random);
    }
}
