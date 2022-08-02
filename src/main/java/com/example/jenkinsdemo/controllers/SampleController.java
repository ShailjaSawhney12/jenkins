package com.example.jenkinsdemo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @GetMapping
    public String message(){
        return "Welcome to java techie!!!!";
    }
}
