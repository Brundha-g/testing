package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Choclate;
import com.example.demo.repository.ChoclateRepo;
import com.example.demo.repository.FlavourRepo;
@Service
public class ChoclateServiceImpl implements ChoclateService {
	@Autowired
	public ChoclateRepo choclateRepo;	
	@Autowired
	public FlavourRepo flavourRepo;

	@Override
	public List<Choclate> getChoclates() {
		// TODO Auto-generated method stub
		return choclateRepo.findAll(JpaSort.by("name").descending());
	}
	@Override
	public void saveChoclate(Choclate choclate) {
		// TODO Auto-generated method stub
		
		this.choclateRepo.save(choclate);
	}
	@Override
	public void updateChoclate(Choclate choclate, String name) {
		Choclate choclateupdate=choclateRepo.findById(name).get();
		choclateupdate.setName(choclate.getName());
		choclateupdate.setCost(choclate.getCost());
        choclateRepo.save(choclateupdate);
	}
	@Override
	public void deleteChoclate(String name) {
		// TODO Auto-generated method stub
		choclateRepo.deleteById(name);
	}
	}
	
