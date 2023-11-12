package com.example.lab5;

import com.example.lab5.models.Pets;
import com.example.lab5.services.OwnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class Lab5Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab5Application.class, args);
	}

}
