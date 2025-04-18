package com.example.ServiceC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServiceC.entity.CarEntity;

public interface ServiceCRepository extends JpaRepository<CarEntity, Integer>{

}
