package com.example.springtomcatapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WebController {
    @GetMapping("/") 
    public String getMessage()
    {
        return "Hello, This is an example of springboot application deployed on tomcat server";
    }
}