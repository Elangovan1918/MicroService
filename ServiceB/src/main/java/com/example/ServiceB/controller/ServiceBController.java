package com.example.ServiceB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServiceB.dto.CarDto;
import com.example.ServiceB.entity.CarEntity;
import com.example.ServiceB.serviceImpl.ServiceBServiceImpl;
import com.example.ServiceB.serviceInterface.ServiceInterface;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ServiceBController {
	
	@Autowired
	private ServiceInterface serviceInterface;
	
	@PostMapping("/saveCarB")
	public CarDto saveCarB(@RequestBody CarDto carDto) {
		
        log.info("[SaveCarB Method] in ServiceBController with CarDto - {}", carDto);

		serviceInterface.saveCarB(carDto);
		
        log.info("CarDto saved successfully in ServiceB - {}", carDto);

		return carDto;
	}

}
