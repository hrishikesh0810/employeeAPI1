package com.example.employeeAPI1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan("com.example.*")
@Configuration
public class EmployeeApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApi1Application.class, args);
	}

}
