package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Animal;

public interface AnimalServiceInterface {
	List<Animal> getallanimals();
	void saveanimal(Animal animal);
}
