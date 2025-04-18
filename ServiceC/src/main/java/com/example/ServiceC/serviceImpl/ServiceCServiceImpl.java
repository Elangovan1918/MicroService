package com.example.ServiceC.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ServiceC.dto.CarDto;
import com.example.ServiceC.entity.CarEntity;
import com.example.ServiceC.repository.ServiceCRepository;
import com.example.ServiceC.serviceInterface.ServiceCServiceInterface;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ServiceCServiceImpl implements ServiceCServiceInterface {
	
	@Autowired
	ServiceCRepository carRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public CarDto saveCarC(CarDto carDto) {
		
		log.info("[Save CarC Method]Saving car - {}", carDto);
		
		CarEntity carEntity=carRepository.save(convertDtoToEntity(carDto));
		
		log.info("Car saved - {}", carEntity);

		
		return convertEntityToDto(carEntity);
	}
	
	public CarDto convertEntityToDto(CarEntity car) {
		
		return modelMapper.map(car, CarDto.class);
	}
	public CarEntity convertDtoToEntity(CarDto car) {
		
		return modelMapper.map(car,CarEntity.class);
	}

}
