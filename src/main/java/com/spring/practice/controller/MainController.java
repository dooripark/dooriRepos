package com.spring.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springPractice")
public class MainController {
    @RequestMapping({"", "/"})
    public String main(){
        return "index";
    }
}