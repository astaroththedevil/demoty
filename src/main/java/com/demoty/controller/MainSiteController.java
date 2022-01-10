package com.demoty.controller;

import com.demoty.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class MainSiteController {

    @Autowired
    private PostService postService;

    @GetMapping("/demoty-glowna")
    public String showMainSite(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "index";
    }
}
