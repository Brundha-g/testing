package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Classname;
public interface ClassRepo extends JpaRepository<Classname,Long> {

}
