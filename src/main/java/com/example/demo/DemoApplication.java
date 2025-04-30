package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		// wat het kaboutertje typt bij opspinnen app
//		CustomBean customBean = new CustomBean();
//		BeanService beanService = new BeanService(customBean);

		// wat het kaboutertje doet na de uitbreidingen
//		ExampleConfig exampleConfig = new ExampleConfig();
//		String blablaBean = exampleConfig.blablaBean();
//		String lalaBean = exampleConfig.lalaBean();
//		CustomBean customBean = new CustomBean();
//		BeanService beanService = new BeanService();
//		beanService.setName(blablaBean); // vrije vertaling - eigenlijk reflection
//		beanService.setCb(cb); // vrij vertaling - eigenlijk reflection
//		BeanServiceService beanServiceService = new BeanServiceService(beanService);


	}

}
