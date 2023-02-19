package com.example.FisrtSpringBoot_With_Gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FisrtSpringBootWithGradleApplication {

	@GetMapping("/")
	public int getMethod() {
		return 1;
	}
	@GetMapping("/2")
	public int getMethod2() {
		return 2;
	}
	public static void main(String[] args) {
		System.out.println("Testing this application First");
		SpringApplication.run(FisrtSpringBootWithGradleApplication.class, args);
	}

}
