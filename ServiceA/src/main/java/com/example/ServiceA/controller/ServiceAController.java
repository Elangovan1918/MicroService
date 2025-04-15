package com.example.ServiceA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.ServiceA.dto.Car;
import com.example.ServiceA.service.ServiceAService;

@RestController
public class ServiceAController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ServiceAService serviceAService;
	
	@PostMapping("/saveA")
	public ResponseEntity<Car> SaveA(@RequestBody Car car) {
		
		serviceAService.saveA(car);
		System.out.println(car);
		ResponseEntity<Car> car1=restTemplate.postForEntity("http://localhost:8883/saveB", car, Car.class);
		
		return car1;
	}

}
