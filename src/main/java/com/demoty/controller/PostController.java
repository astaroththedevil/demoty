package com.demoty.controller;

import com.demoty.model.Post;
import com.demoty.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@RequiredArgsConstructor
public class PostController {

    @Autowired
    private PostService postService;

    @PutMapping("/add-post")
    public Post addPost(Post post) {
       return postService.addPost(post);
    }

    @DeleteMapping("/delete-post")
    public void deletePost(Integer id) {
        postService.deletePostById(id);
    }
}
