package com.example.ServiceB.ServiceBService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ServiceB.ServiceBRepository.ServiceBRepository;
import com.example.ServiceB.dto.Car;

@Service
public class ServiceBService {
	
	@Autowired
	ServiceBRepository serviceBRepository;
	
	public Car saveB(Car car) {
		
		return serviceBRepository.save(car);
	}

}
