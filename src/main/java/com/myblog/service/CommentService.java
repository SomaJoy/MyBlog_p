package com.myblog.service;

import com.myblog.payload.CommentDto;

public interface CommentService {
    CommentDto creteComment(CommentDto commentDto, long postId);

    void deleteComment(long id);

    CommentDto updateComment(CommentDto commentDto, long id);
}
