package com.example.ServiceA;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	
	RestTemplate restTemplate;
	
	@Bean
	public RestTemplate getObject() {
		
		return new RestTemplate();
	}

}
