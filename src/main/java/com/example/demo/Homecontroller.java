package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class Homecontroller {
    @RequestMapping("/")
    public String homepage(){
    return "index";
}
}
