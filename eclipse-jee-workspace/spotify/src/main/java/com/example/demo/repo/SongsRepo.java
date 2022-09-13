package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Songs;
@Repository
public interface SongsRepo extends JpaRepository<Songs,String> {

}
