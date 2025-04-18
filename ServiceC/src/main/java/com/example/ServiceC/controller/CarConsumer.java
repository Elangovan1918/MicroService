package com.example.ServiceC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.example.ServiceC.dto.CarDto;
import com.example.ServiceC.serviceInterface.ServiceCServiceInterface;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CarConsumer {
	
	@Autowired
	ServiceCServiceInterface serviceInterface;
	
	
	@Autowired
	ObjectMapper objectMapper;
	
	@KafkaListener(topics = "CarService-topic",groupId = "my-group")
	public void saveCarC(String car) {
		try {
		CarDto car2=objectMapper.readValue(car, CarDto.class);
		
		serviceInterface.saveCarC(car2);
		
        log.info("Car saved successfully - {}", car2);
        
		}catch (Exception e) {
			e.printStackTrace();

		}
	}

}
