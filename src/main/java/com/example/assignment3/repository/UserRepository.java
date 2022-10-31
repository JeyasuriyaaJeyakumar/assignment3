package com.example.assignment3.repository;

import com.example.assignment3.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User, String> {

}
