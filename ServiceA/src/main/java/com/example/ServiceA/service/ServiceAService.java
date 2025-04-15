package com.example.ServiceA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ServiceA.dto.Car;
import com.example.ServiceA.repository.ServiceARepository;

@Service
public class ServiceAService {
	
	@Autowired
	private ServiceARepository serviceARepository;
	
	public Car saveA(Car car) {
		
		return serviceARepository.save(car);
	}

}
