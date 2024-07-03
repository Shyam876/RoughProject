package com.example.rough;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class RoughApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoughApplication.class, args);
	}

}
