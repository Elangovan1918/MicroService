package com.example.ServiceA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServiceA.Entity.CarEntity;

public interface ServiceARepository extends JpaRepository<CarEntity, Integer> {

}
