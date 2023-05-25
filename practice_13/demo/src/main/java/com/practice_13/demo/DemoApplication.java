package com.practice_13.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		var applicationContext = SpringApplication.run(DemoApplication.class, args);
	}
}

