package com.example.ServiceC.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ServiceC.Entity.CarEntity;
import com.example.ServiceC.Repository.CarRepository;
import com.example.ServiceC.ServiceInterface.ServiceInterface;

@Service
public class ServiceImpl implements ServiceInterface {
	
	@Autowired
	CarRepository carRepository;
	
	public CarEntity saveCarC(CarEntity car) {
		
		return carRepository.save(car);
	}

}
