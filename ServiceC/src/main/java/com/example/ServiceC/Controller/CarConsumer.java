package com.example.ServiceC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.example.ServiceC.Entity.CarEntity;
import com.example.ServiceC.ServiceInterface.ServiceInterface;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class CarConsumer {
	
	@Autowired
	ServiceInterface serviceInterface;
	
	@KafkaListener(topics = "CarService-topic",groupId = "my-group")
	public void saveCarc(String car) {
		try {
		ObjectMapper objectMapper=new ObjectMapper();
		CarEntity car2=objectMapper.readValue(car, CarEntity.class);
		serviceInterface.saveCarC(car2);
		}catch (Exception e) {
			e.printStackTrace();

		}
	}

}
