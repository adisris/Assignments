package com.example.assignment1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/helloWorld")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!, Welcome to My World!";
    }
}