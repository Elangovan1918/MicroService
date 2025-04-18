package com.example.ServiceA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.ServiceA.Dto.CarDto;
import com.example.ServiceA.Entity.CarEntity;
import com.example.ServiceA.ServiceImpl.ServiceAServiceImpl;
import com.example.ServiceA.ServiceInterface.ServiceAInterface;

@RestController
public class ServiceAController {
	
	@Autowired
	private ServiceAInterface serviceInterface;
	
	@PostMapping("/saveCarA")
	public CarDto saveCarA(@RequestBody CarDto carDto) {
		
		serviceInterface.saveCarA(carDto);
		return carDto;
	}

}
