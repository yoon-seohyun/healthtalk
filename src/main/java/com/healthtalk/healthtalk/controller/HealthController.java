package com.healthtalk.healthtalk.controller;

import com.healthtalk.healthtalk.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.healthtalk.healthtalk.service.CommentService;

@Controller
public class HealthController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/board/write") //localhost:9090/board/write
    public String boardWriteForm() {
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Comment comment) {

        commentService.write(comment);

        return "redirect:/board/list";
    }
}
