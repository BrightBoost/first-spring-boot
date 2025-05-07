package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class NewCustomRunner implements CommandLineRunner {
    private ApplicationContext ac;

    public NewCustomRunner(ApplicationContext ac) {
        this.ac = ac;
    }

    @Override
    public void run(String... args) {
        InfoPrinter ip = ac.getBean(InfoPrinter.class);
        ip.displayInfo();
    }
}
