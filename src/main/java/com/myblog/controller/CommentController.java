package com.myblog.controller;

import com.myblog.entity.Comment;
import com.myblog.payload.CommentDto;
import com.myblog.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/comments")
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    //http:localhost:8080/api/comments?id=1
    @PostMapping
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto, @RequestParam long postId){
        CommentDto dto = commentService.creteComment(commentDto, postId);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable long id){
        commentService.deleteComment(id);
        return new ResponseEntity<>("Comment deleted with id - "+id, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CommentDto> updateComment(@RequestBody CommentDto commentDto, @PathVariable long id){
        CommentDto dto = commentService.updateComment(commentDto, id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
