package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Animal;
import com.example.demo.service.AnimalServiceInterface;

@RestController
public class Animalcontroller {
	@Autowired
	private AnimalServiceInterface animalinter;
	
	@GetMapping("/Animalslist")
	public List<Animal> animalslist(){
		return animalinter.getallanimals();
	}
	@PostMapping("/saveAnimal")
	public void saveAnimal(@RequestBody Animal animal) {
		animalinter.saveanimal(animal);
	}

}
