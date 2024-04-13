package net.javaguides.springboot.service;

import net.javaguides.springboot.dto.CommentDto;
import net.javaguides.springboot.entity.Comment;

public interface CommentService {
    void createComment(String postUrl, CommentDto commentDto);

}
