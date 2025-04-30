package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ExampleConfig {
    @Primary
    @Bean("blablaBean")
    public String blablaBean() {
        return "blabalbalbala";
    }

    //@Primary
    @Bean("lalaBean")
    public String lalaBean() {
        return "lalalalala";
    }
}
