package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Choclate;
import com.example.demo.model.Flavour;
import com.example.demo.repository.FlavourRepo;
import com.example.demo.service.ChoclateService;
@RestController
public class ChoclateController {
	@Autowired
	public ChoclateService choclateservice;
	@Autowired
	public FlavourRepo flavourRepo;
	@GetMapping("/Choclateslist")
	public List<Choclate> choclateslist(){
		return choclateservice.getChoclates();
	}
	@PostMapping("/Choclatesave")
	public void saveChoclate(@RequestBody Choclate choclate) {
		Flavour f = flavourRepo.getByName(choclate.getFlavour().getName());
		  if(f==null)
		  { 
			  f =new Flavour(choclate.getFlavour().getName());
			  }
		  choclate.setFlavour(f); 
		  choclateservice.saveChoclate(choclate); 
	}
	@PutMapping("/update/{name}")
	public void updateChoclate(@PathVariable String name,@RequestBody Choclate choclate) {
		choclateservice.updateChoclate(choclate, name);
	}
	@DeleteMapping("/delete/{name}")
	public void deleteChoclate(@PathVariable String name) {
		choclateservice.deleteChoclate(name);
	}
}
