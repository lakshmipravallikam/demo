package com.demo.practice1.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.practice1.entity.Car;
import com.demo.practice1.repository.CarRepository;
import com.demo.practice1.service.CarService;
@Service
public class CarServiceImpl implements CarService {
@Autowired
CarRepository carRepository;
	@Override
	public void save(Car car) {
		carRepository.save(car);
		
		
		
	}
	@Override
	public Car getById(int id) {
		
		return carRepository.findById(id).get();
	}
	@Override
	public List<Car> getAll() {
		
		return carRepository.findAll();
	}
	@Override
	public void update(Car car) {
		carRepository.save(car);
		
	}
	@Override
	public void deleteById(int id) {
	carRepository.deleteById(id);			
	}

}
