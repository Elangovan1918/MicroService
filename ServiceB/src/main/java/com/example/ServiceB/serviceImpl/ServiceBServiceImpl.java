package com.example.ServiceB.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.ServiceB.dto.CarDto;
import com.example.ServiceB.entity.CarEntity;
import com.example.ServiceB.repository.ServiceBRepository;
import com.example.ServiceB.serviceInterface.ServiceInterface;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ServiceBServiceImpl implements ServiceInterface{
	
	@Autowired
	ServiceBRepository serviceBRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemp;
	
	public CarDto saveCarB(CarDto carDto) {
		
        log.info("[SaveCarB Method] in ServiceBServiceImpl with CarDto - {}", carDto);

		
		serviceBRepository.save(convertDtoToEntity(carDto));
		
        log.info("CarEntity saved to the database");
				
		kafkaTemp.send("CarService-topic", "", carDto.toString());
		
        log.info("Sent message to Kafka topic 'CarService-topic' - {}", carDto);

		
		return carDto;

	}

	public CarDto convertEntityToDto(CarEntity car) {
		
		return modelMapper.map(car, CarDto.class);
	}
	public CarEntity convertDtoToEntity(CarDto car) {
		
		return modelMapper.map(car,CarEntity.class);
	}

}
