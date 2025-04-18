package com.example.ServiceC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServiceC.Entity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Integer>{

}
