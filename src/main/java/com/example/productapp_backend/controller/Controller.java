package com.example.productapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/")
    public String Home(){
        return "home";
    }

    @PostMapping("/add")
    public String Add(){
        return "Add";
    }


}
