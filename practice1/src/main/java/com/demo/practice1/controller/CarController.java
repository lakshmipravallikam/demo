package com.demo.practice1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.practice1.entity.Car;
import com.demo.practice1.service.CarService;

@RestController
public class CarController {
	@Autowired
	CarService carService;
	@PostMapping("/car")
	public String save(@RequestBody Car car) {
		carService.save(car);
		return car.getModel()+ " added successfully";
		
		
	}
@GetMapping ("/car/{id}")
public Car getById(@PathVariable int id) {
	return carService.getById(id);
	
}
@GetMapping ("/car")
public List<Car> getById() {
	return carService.getAll();
	
}
@PutMapping("/car")
public String update(@RequestBody Car car) {
	carService.update(car);
	return car.getModel()+ " added successfully";
	
	
}
@DeleteMapping("/car/{id}")
public String delete(@PathVariable int id) {
	carService.deleteById(id);
	return id+" deleted successfully";
	
}
}
