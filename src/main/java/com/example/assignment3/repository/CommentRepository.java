package com.example.assignment3.repository;

import com.example.assignment3.model.Comment;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class CommentRepository {
    List<Comment> commentList = new ArrayList();
    public List<Comment> getAllComment() {
        return commentList;
    }

    public Comment getCommentById(int id) {
        for (Comment comment:commentList){
            if (comment.getId() == id){
                return comment;
            }
        }
        return null;
    }

    public Comment saveComment(Comment comment) {
        comment.setId(commentList.size() +1);
        commentList.add(comment);
        return comment;
    }

    public Comment updateComment(int id, Comment comment) {
        for (Comment c:commentList){
            if (c.getId() == id){
                c.setPhotoId(comment.getPhotoId());
                c.setMessage(comment.getMessage());
                c.setCreatedBy(comment.getCreatedBy());
                c.setDateCreated(comment.getDateCreated());
                return c;
            }
        }
        return null;
    }

    public Comment deleteComment(int id) {
        Comment deletedComment = null;
        for (Comment c:commentList){
            if(c.getId() == id){
                deletedComment = c;
                commentList.remove(c);
                return deletedComment;
            }
        }
        return deletedComment;
    }
}
