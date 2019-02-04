package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountsServer
{
	public static void main(String[] args)
	{
		System.setProperty("system.config.name", "application");
		SpringApplication.run(AccountsServer.class, args);
	}
}
