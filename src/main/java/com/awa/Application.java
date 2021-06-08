package com.awa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);//SpringApplication.run(Application.class, args)Ctrl 1;
	    Employee bean = run.getBean(Employee.class);//Employee bean = return type
	    bean.storeAddress();
	
	}  

}
