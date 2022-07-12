package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Animal;
import com.example.demo.repo.Animalrepo;

@Service
public class AnimalServiceClass implements AnimalServiceInterface {

	@Autowired
	private Animalrepo animalrepo;
	
	@Override
	public List<Animal> getallanimals() {
		// TODO Auto-generated method stub
		return animalrepo.findAll();
	}

	@Override
	public void saveanimal(Animal animal) {
		this.animalrepo.save(animal);

	}

}
