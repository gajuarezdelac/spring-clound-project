package com.ws.api.mc_users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class McUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(McUsersApplication.class, args);
	}

}
