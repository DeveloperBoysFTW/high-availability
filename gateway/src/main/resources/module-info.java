module gateway {
	exports com.example.gateway;
	exports com.example.gateway.config;

	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.cloud.commons;
	requires spring.cloud.gateway.server;
	requires spring.context;
	requires spring.core;
	requires spring.web;
}