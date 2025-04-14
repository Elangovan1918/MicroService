package com.example.ServiceC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ServiceC.dto.Car;
import com.example.ServiceC.repository.CarRepository;

@Service
public class CarServiceC {
	
	@Autowired
	CarRepository carRepository;
	
	public Car saveCar(Car c) {
		
		return carRepository.save(c);
	}

}
