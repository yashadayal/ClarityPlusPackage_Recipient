package com.ClarityPlusPackage.RecipientMService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = {"com.ClarityPlusPackage.RecipientMService.Controller","com.ClarityPlusPackage.RecipientMService.Service","com.ClarityPlusPackage.RecipientMService.Repository","com.ClarityPlusPackage.RecipientMService.Service.Implementation"})
@EnableJpaRepositories
@EnableWebMvc
public class RecipientMServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipientMServiceApplication.class, args);
	}

}
