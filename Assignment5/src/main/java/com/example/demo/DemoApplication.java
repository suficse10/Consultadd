package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	public User user;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World!");
	}

	@GetMapping("/")
	public String hello(){
		return String.format("Hello World!");
	}

	//to get user info as json data
	@GetMapping("/user")
	public User getUser(){
		user.setFirstName("David");
		user.setLastName("Lynch");
		user.setEmail("abc@email.com");
		return user;
	}

}
