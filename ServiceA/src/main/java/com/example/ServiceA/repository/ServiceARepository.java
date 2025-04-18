package com.example.ServiceA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServiceA.entity.CarEntity;

public interface ServiceARepository extends JpaRepository<CarEntity, Integer> {

}
