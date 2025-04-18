package com.example.ServiceA.serviceInterface;

import org.springframework.http.ResponseEntity;

import com.example.ServiceA.dto.CarDto;
import com.example.ServiceA.entity.CarEntity;

public interface ServiceAInterface {
	
	public CarDto saveCarA(CarDto carDto);

}
