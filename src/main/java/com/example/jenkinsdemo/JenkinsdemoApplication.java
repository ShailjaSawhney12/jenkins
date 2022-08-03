package com.example.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsdemoApplication {

	@GetMapping("/hello")
	public String message(){
		return "Welcome to java techie!!!!";
	}
	public static void main(String[] args) {


		SpringApplication.run(JenkinsdemoApplication.class, args);

		System.out.println("Hello!!!  This is Jenkins.....");
	}

}
