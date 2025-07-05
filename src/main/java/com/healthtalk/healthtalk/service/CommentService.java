package com.healthtalk.healthtalk.service;

import com.healthtalk.healthtalk.entity.Comment;
import com.healthtalk.healthtalk.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Transactional
    public void write(Comment comment) {

        commentRepository.save(comment);
    }



}
