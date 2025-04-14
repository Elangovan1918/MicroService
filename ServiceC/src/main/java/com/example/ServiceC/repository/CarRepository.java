package com.example.ServiceC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServiceC.dto.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

}
