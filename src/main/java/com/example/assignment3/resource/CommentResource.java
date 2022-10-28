package com.example.assignment3.resource;

import com.example.assignment3.model.Comment;
import com.example.assignment3.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class CommentResource {
    @Autowired
    private CommentService commentService;

    @GetMapping("/comment")
    public List<Comment> getAllComment(){
        return commentService.getAllComment();
    }

    @GetMapping("/comment/{id}")
    public Comment getCommentById(@PathVariable("id") int id){
        return commentService.getCommentById(id);
    }
    //POST  methods
    @PostMapping("/comment")
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    //PUT methods
    @PutMapping("/comment/{id}")
    public Comment updateComment(@PathVariable("id") int id, @RequestBody Comment comment){
        return commentService.updateComment(id, comment);
    }

    //DELETE methods
    @DeleteMapping("/comment")
    public Comment deleteComment(@RequestParam(name = "id")int id){
        return commentService.deleteComment(id);
    }
}
