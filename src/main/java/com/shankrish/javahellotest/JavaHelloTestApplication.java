package com.shankrish.javahellotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaHelloTestApplication {

	@GetMapping({"/", "/home", "index"})
	public String showIndexText() {
		return "This text from index";
	}

	@RequestMapping("/test")
	public String showTestText() {
		return "This text of all RequestMapping";
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaHelloTestApplication.class, args);
	}

}
