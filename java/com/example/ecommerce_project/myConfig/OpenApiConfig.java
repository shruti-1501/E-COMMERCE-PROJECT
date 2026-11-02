package com.example.ecommerce_project.myConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class OpenApiConfig {

	
	@Bean
	public OpenAPI customOpenAPI() {
		
		return new OpenAPI()
				.info(
						new Info()
						.title("E-Commerce REST API")
						.version("1.0")
						.description("Spring Boot E-Commerce Project APIs"));
	}
}