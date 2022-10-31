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

    @GetMapping("/find")
    public List<Comment> getCommentById(@RequestParam(name = "id")String id){
        return commentService.getCommentById(id);
    }

    //PUT methods
    @PutMapping
    public Comment updateComment( @RequestBody Comment comment){
        return commentService.updateComment(comment);
    }
    //DELETE methods
    @DeleteMapping
    public void deleteComment(@RequestParam(name = "id")String id){
          commentService.deleteComment(id);
    }
    /*

    @GetMapping("/comment/{id}")
    public Comment getCommentById(@PathVariable("id") int id){
        return commentService.getCommentById(id);
    }





     */
}
