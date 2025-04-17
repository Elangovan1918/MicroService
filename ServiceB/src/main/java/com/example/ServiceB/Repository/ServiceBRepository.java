package com.example.ServiceB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServiceB.Entity.CarEntity;

public interface ServiceBRepository extends JpaRepository<CarEntity, Integer> {

}
