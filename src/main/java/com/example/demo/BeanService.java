package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanService {
    // field injection - gebruiken we voor tests, slechter voor performance
    // @Autowired // this is field injection
    @Autowired
    CustomBean cb;

    @Autowired
    @Qualifier("blablaBean")
    String name;
    // constructor injection -way to go
   // @Autowired // niet nodig in dit geval, want maar 1 constructor met argumenten
    public BeanService(CustomBean cb) {
        this.cb = cb;
    }
    public BeanService(CustomBean cb, String name) {
        this.cb = cb;
        this.name = name;
    }

    public BeanService(){}

    public CustomBean getCb() {
        return cb;
    }

    public void setCb(CustomBean cb) {
        this.cb = cb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
