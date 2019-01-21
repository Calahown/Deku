package com.roastgg.deku.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DekuListenerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DekuListenerServiceApplication.class, args);
	}

}

