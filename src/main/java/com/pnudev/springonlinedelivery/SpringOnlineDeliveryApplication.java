package com.pnudev.springonlinedelivery;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOnlineDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOnlineDeliveryApplication.class, args);
	}

	@GetMapping(path = "/")
	public List<User> hello() { //test cases
		return List.of(
			new User(1, "Chaim", "Jugu", "sus@gmail.com", "5295"),
			new User(2, "Andrew", "Igorchenko", "sus@gmail.com", "7386")
		);
	}
}
