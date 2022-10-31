package com.example.assignment3.repository;

import com.example.assignment3.model.Comment;
import com.example.assignment3.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
