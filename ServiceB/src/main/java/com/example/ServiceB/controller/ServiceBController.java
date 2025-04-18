package com.example.ServiceB.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServiceB.Entity.CarEntity;
import com.example.ServiceB.ServiceImpl.ServiceBServiceImpl;
import com.example.ServiceB.ServiceInterface.ServiceInterface;

@RestController
public class ServiceBController {
	
	@Autowired
	private ServiceInterface serviceInterface;
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemp;
	
	@PostMapping("/saveB")
	public CarEntity saveCarB(@RequestBody CarEntity car) {
		serviceInterface.saveCarB(car);
		System.out.println(car);
		kafkaTemp.send("CarService-topic", "Key", car.toString());
		return car;
	}

}
