package com.example.reptile_practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String helloWorld(){
        return "helloWorld";
    }
}
