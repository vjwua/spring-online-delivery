package com.pnudev.springonlinedelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.pnudev.springonlinedelivery.mapper")
public class SpringOnlineDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOnlineDeliveryApplication.class, args);
	}
}
