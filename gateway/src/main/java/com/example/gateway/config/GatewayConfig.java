package com.example.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {


	  		@Bean
		    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
	  			
	  			System.out.println("this is 9000");
		    	 return builder.routes()
		                 .route("tester1-route", r -> r.path("/tester1/**")
		                         .uri("lb://TESTER1-SERVICE"))
		                 .route("tester2-route", r -> r.path("/tester2/**")
		                         .uri("lb://TESTER2-SERVICE"))
		                 .build();
		
	}
}
