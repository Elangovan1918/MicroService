package com.example.ServiceB.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CarEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carNumber;
	
	private String carName;
	
	private double carPrice;
	
	private String carColor;
	
	private String carType;
	
	private String carModel;


}
