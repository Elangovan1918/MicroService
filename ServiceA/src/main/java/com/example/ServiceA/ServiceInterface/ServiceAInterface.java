package com.example.ServiceA.ServiceInterface;

import org.springframework.http.ResponseEntity;

import com.example.ServiceA.Dto.CarDto;
import com.example.ServiceA.Entity.CarEntity;

public interface ServiceAInterface {
	
	public ResponseEntity<CarDto> saveCarA(CarDto carDto);

}
