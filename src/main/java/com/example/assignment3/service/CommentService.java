package com.example.assignment3.service;

import com.example.assignment3.model.Comment;
import com.example.assignment3.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }
    public List<Comment> getAllComment() {
        return commentRepository.findAll();
    }

    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(String id) {
          commentRepository.deleteById(id);
    }

    public List<Comment> getCommentById(String id) {
        return commentRepository.findAllById(id);
    }

    /*


    public Comment getCommentById(int id) {
        return commentRepository.getCommentById(id);
    }



     */
}
