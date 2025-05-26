package com.hugoferreira.controlekm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String showHelloWorldPage(Model model){
        model.addAttribute("message", "Hello World : Spring Boot and Thymeleaf App");
        return "hello";
    }
}
