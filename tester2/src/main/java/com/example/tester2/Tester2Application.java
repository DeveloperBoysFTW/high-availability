package com.example.tester2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Tester2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tester2Application.class, args);
	}

}
