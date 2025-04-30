package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BeanServiceService {
    // beanService is een dependency van BeanServiceService : maw bss depends on bs
    BeanService beanService;

    public BeanServiceService(BeanService beanService) {
        this.beanService = beanService;
    }

    public BeanService getBeanService() {
        return beanService;
    }

    public void setBeanService(BeanService beanService) {
        this.beanService = beanService;
    }
}
