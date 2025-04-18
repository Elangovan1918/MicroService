package com.example.ServiceA.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ServiceA.dto.CarDto;
import com.example.ServiceA.entity.CarEntity;
import com.example.ServiceA.repository.ServiceARepository;
import com.example.ServiceA.serviceInterface.ServiceAInterface;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ServiceAServiceImpl implements ServiceAInterface {
	
	@Autowired
	private ServiceARepository serviceARepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	public CarDto saveCarA(CarDto carDto) {
		
        log.info("[SaveCarA Method] with CarDto - {}", carDto);
			
		serviceARepository.save(convertDtoToEntity(carDto));
		
        log.info("CarEntity saved to the database");

        log.info("Sending CarDto to Service B via REST call...");

		CarDto carDtoResponse=restTemplate.postForEntity("http://localhost:8883/saveCarB", carDto, CarDto.class).getBody();
        
		log.info("Received response from Service B - {}", carDtoResponse);

		 return carDtoResponse;
	}
	
	
	
	public CarDto convertEntityToDto(CarEntity car) {
		
		return modelMapper.map(car, CarDto.class);
	}
	public CarEntity convertDtoToEntity(CarDto car) {
		
		return modelMapper.map(car,CarEntity.class);
	}

}
