package com.solutis.helpdesk.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SolutisHelpdeskGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolutisHelpdeskGatewayApplication.class, args);
	}

}
