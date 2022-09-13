package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Organisation;
@Repository
public interface OrgRepo extends MongoRepository<Organisation,Long> {

}
