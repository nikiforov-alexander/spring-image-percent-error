package com.example.bug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BugController {
    @RequestMapping("/")
    public String showImage() {
        return "home";
    }
}
