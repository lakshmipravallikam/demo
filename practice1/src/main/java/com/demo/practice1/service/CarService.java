package com.demo.practice1.service;

import java.util.List;

import com.demo.practice1.entity.Car;

public interface CarService {

	public void save(Car car);

	public Car getById(int id);

	public List<Car> getAll();

	public void update(Car car);

	public void deleteById(int id);

	

}
