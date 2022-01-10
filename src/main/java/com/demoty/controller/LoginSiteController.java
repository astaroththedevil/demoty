package com.demoty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginSiteController {

    @GetMapping("/login")
    public String showLoginSite() {
        return "login";
    }
}
