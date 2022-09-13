package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Choclate;
import com.example.demo.model.Flavour;

public interface ChoclateService {
	List<Choclate> getChoclates();
	void saveChoclate(Choclate choclate);
	void updateChoclate(Choclate choclate,String name);
	void deleteChoclate(String name);
}
