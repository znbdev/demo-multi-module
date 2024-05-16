package com.example.demo;

import com.example.demo.service.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@SpringBootApplication(scanBasePackages = "com.example.demo")
public class DemoWebApplication {

	private final MyService myService;

	@GetMapping("/")
	public String home() {
		return myService.message();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}
}
