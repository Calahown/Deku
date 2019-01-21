package com.roastgg.deku.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DekuRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DekuRegistryServiceApplication.class, args);
	}

}

