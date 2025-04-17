package com.example.ServiceB.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ServiceB.Entity.CarEntity;
import com.example.ServiceB.Repository.ServiceBRepository;
import com.example.ServiceB.ServiceInterface.ServiceInterface;

@Service
public class ServiceBServiceImpl implements ServiceInterface{
	
	@Autowired
	ServiceBRepository serviceBRepository;
	
	public CarEntity saveCarB(CarEntity car) {
		
		return serviceBRepository.save(car);
	}

}
