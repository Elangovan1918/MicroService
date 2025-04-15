package com.example.ServiceB.ServiceBController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServiceB.ServiceBService.ServiceBService;
import com.example.ServiceB.dto.Car;

@RestController
public class ServiceBController {
	
	@Autowired
	ServiceBService serviceBService;
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemp;
	
	@PostMapping("/saveB")
	public Car saveB(@RequestBody Car car) {
		serviceBService.saveB(car);
		System.out.println(car);
		kafkaTemp.send("CarService-topic", "Key", car.toString());
		return car;
	}

}
