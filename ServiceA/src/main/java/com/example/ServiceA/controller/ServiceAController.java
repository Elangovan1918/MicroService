package com.example.ServiceA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.ServiceA.dto.CarDto;
import com.example.ServiceA.entity.CarEntity;
import com.example.ServiceA.serviceImpl.ServiceAServiceImpl;
import com.example.ServiceA.serviceInterface.ServiceAInterface;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
public class ServiceAController {
	
	@Autowired
	private ServiceAInterface serviceInterface;
	
	
	@PostMapping("/saveCarA")
	public CarDto saveCarA(@RequestBody CarDto carDto) {
		
        log.info("[SaveCarA Method] in ServiceAController with CarDto - {}", carDto);
		
		serviceInterface.saveCarA(carDto);
		
        log.info("Car saved and received response from Service B - {}", carDto);

		
		return carDto;
	}

}
