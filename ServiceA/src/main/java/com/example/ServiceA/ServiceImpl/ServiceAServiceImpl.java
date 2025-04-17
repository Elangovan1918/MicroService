package com.example.ServiceA.ServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ServiceA.Dto.CarDto;
import com.example.ServiceA.Entity.CarEntity;
import com.example.ServiceA.Repository.ServiceARepository;
import com.example.ServiceA.ServiceInterface.ServiceAInterface;

@Service
public class ServiceAServiceImpl implements ServiceAInterface {
	
	@Autowired
	private ServiceARepository serviceARepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ResponseEntity<CarDto> saveCarA(CarDto carDto) {
		
		serviceARepository.save(convertDtoToEntity(carDto));
		
		ResponseEntity<CarDto> carDto2=restTemplate.postForEntity("http://localhost:8883/saveB", carDto, CarDto.class);
		 
		 return carDto2;
	}
	
	
	
	public CarDto convertEntityToDto(CarEntity car) {
		
		return modelMapper.map(car, CarDto.class);
	}
	public CarEntity convertDtoToEntity(CarDto car) {
		
		return modelMapper.map(car,CarEntity.class);
	}

}
