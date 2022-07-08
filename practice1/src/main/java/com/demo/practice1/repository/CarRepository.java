package com.demo.practice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.practice1.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer>  {
	

}
