package com.example.tester1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Tester1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tester1Application.class, args);
	}

}
