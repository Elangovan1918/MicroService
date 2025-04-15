package com.example.ServiceA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServiceA.dto.Car;

public interface ServiceARepository extends JpaRepository<Car, Integer> {

}
