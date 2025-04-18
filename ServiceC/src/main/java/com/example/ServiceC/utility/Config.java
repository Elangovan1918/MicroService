package com.example.ServiceC.utility;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class Config {
		
	ObjectMapper objectMapper;
	
	ModelMapper modelMapper;
	
	
	@Bean
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
