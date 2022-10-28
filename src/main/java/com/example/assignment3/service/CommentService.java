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
    public List<Comment> getAllComment() {
        return commentRepository.getAllComment();
    }

    public Comment getCommentById(int id) {
        return commentRepository.getCommentById(id);
    }

    public Comment saveComment(Comment comment) {
        return commentRepository.saveComment(comment);
    }

    public Comment updateComment(int id, Comment comment) {
        return commentRepository.updateComment(id, comment);
    }

    public Comment deleteComment(int id) {
        return commentRepository.deleteComment(id);
    }
}
