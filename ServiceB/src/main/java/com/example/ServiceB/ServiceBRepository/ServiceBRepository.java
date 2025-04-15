package com.example.ServiceB.ServiceBRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServiceB.dto.Car;

public interface ServiceBRepository extends JpaRepository<Car, Integer> {

}
