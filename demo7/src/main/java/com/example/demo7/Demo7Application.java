package com.example.demo7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.demo7.service.CustomerServiceImpl;

@SpringBootApplication
public class Demo7Application {

	public static void main(String[] args) {
		AbstractApplicationContext context = (AbstractApplicationContext)
		SpringApplication.run(Demo7Application.class, args);
		
		  CustomerServiceImpl service1 = (CustomerServiceImpl)
				  context.getBean("CustomerService");
		  System.out.println("The customerService1 output=" + service1.fetchCustomer());
		  service1.setCount(20);
		  System.out.println("The customerservice1 output after setmethod=" + service1.fetchCustomer());
		  CustomerServiceImpl service2 = (CustomerServiceImpl) 
				  context.getBean("CustomerService");
		  System.out.println("The customerservice2 output =" + service2.fetchCustomer());
		             System.out.println(service1 ==service2);
		             context.close();
				  
		
	}

}
