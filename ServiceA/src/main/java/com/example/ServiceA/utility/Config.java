package com.example.ServiceA.utility;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	
	RestTemplate restTemplate;
	
	ModelMapper modelMapper;
	
	@Bean
	public RestTemplate getObject() {
		
		return new RestTemplate();
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
