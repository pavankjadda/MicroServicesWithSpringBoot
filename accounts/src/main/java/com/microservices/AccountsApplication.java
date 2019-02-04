package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountsApplication
{
	public static void main(String[] args)
	{
		//System.setProperty("spring.config.name", "accounts-service");
		SpringApplication.run(AccountsApplication.class, args);
	}
}
