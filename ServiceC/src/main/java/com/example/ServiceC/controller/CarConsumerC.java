package com.example.ServiceC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.ServiceC.dto.Car;
import com.example.ServiceC.service.CarServiceC;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class CarConsumerC {
	
	@Autowired
	CarServiceC carServiceC;
	
	@KafkaListener(topics = "CarService-topic",groupId = "my-group")
	public void saveCarc(String car) {
		try {
		ObjectMapper objectMapper=new ObjectMapper();
		Car car2=objectMapper.readValue(car, Car.class);
		System.out.println("CarConsumer");
		 carServiceC.saveCar(car2);
		}catch (Exception e) {
			e.printStackTrace();

		}
	}

}
