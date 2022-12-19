package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.company.entity.Company;
import com.company.repository.CompanyRepository;

@SpringBootApplication
public class SpringBootCrudExample2Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudExample2Application.class, args);
	}
}
