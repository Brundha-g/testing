package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Choclate;
@Repository
public interface ChoclateRepo extends JpaRepository<Choclate, String>{

}
