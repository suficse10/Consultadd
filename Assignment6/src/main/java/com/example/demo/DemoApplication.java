package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World!");
	}

	@GetMapping("/")
	public String hello(){
		return String.format("Hello World!");
	}

	@PostMapping("/post")
	public String printRequest(@RequestBody String request){
		System.out.println(request);
		return request;
	}

}
