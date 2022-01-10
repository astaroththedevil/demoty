package com.demoty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterSiteController {

    @GetMapping("/register")
    public String showRegisterSite() {
        return "register";
    }
}
