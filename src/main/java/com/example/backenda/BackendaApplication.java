package com.example.backenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendaApplication {

	@GetMapping("/")
	public String msg()
	{
		return "heloo whatsup";
	}
	public static void main(String[] args) {
		SpringApplication.run(BackendaApplication.class, args);
	}

}
