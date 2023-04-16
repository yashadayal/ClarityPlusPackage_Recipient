package com.ClarityPlusPackage.RecipientMService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.ClarityPlusPackage.RecipientMService.Service","com.ClarityPlusPackage.RecipientMService.Controller","com.ClarityPlusPackage.RecipientMService.Repository","com.ClarityPlusPackage.RecipientMService.Service.Implementation"})
@EnableJpaRepositories
public class RecipientMServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipientMServiceApplication.class, args);
	}

}
