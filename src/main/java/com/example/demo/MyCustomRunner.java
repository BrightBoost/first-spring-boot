package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyCustomRunner implements CommandLineRunner {
    @Autowired
    ApplicationContext ac;
    @Override
    public void run(String... args) {
        System.out.println("hallo!");
        System.out.println("Ik heb ontvangen: ");
        for(String s : args) {
            System.out.println(s);
        }

        for(String beanName : ac.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        CustomBean cb = ac.getBean(CustomBean.class);
        cb.doSomething();

        BeanService bs = ac.getBean(BeanService.class);
        bs.getCb().doSomething();

        BeanServiceService bss = ac.getBean(BeanServiceService.class);
        bss.getBeanService().getCb().doSomething();

        String sb = ac.getBean(String.class);
        System.out.println(sb);

    }
}
