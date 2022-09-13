package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Flavour;
@Repository
public interface FlavourRepo extends JpaRepository<Flavour, String> {
public Flavour getByName(String name);
}

