package com.example.ServiceB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServiceB.entity.CarEntity;

public interface ServiceBRepository extends JpaRepository<CarEntity, Integer> {

}
