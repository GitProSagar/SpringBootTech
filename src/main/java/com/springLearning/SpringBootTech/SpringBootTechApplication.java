package com.springLearning.SpringBootTech;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTechApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTechApplication.class, args);
	}

	private final OnePay onePay;

	// Constructor dependency injection
 	public SpringBootTechApplication(OnePay onePay){
		this.onePay = onePay;
	}

	// CommandLineRunner is a Spring Boot interface used to execute custom logic after the application context has been fully initialized
	@Override
	public void run(String... args) throws Exception {
      String payment =  onePay.pay();
		System.out.println("Payment Done :"+payment);
	}
}
