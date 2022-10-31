package com.example.assignment3.resource;

import com.example.assignment3.model.Comment;
import com.example.assignment3.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")

public class CommentResource {
    @Autowired
    private CommentService commentService;

    //POST  methods
    @PostMapping
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping
    public List<Comment> getAllComment(){
        return commentService.getAllComment();
    }

    //PUT methods
    @PutMapping
    public Comment updateComment( @RequestBody Comment comment){
        return commentService.updateComment(comment);
    }
    /*

    @GetMapping("/comment/{id}")
    public Comment getCommentById(@PathVariable("id") int id){
        return commentService.getCommentById(id);
    }



    //DELETE methods
    @DeleteMapping("/comment")
    public Comment deleteComment(@RequestParam(name = "id")int id){
        return commentService.deleteComment(id);
    }

     */
}
