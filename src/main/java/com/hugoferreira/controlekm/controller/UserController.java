package com.hugoferreira.controlekm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/dashboard")
    public String showDashboard(Model model){

        model.addAttribute("userName", "Hugo Ferreira");
        model.addAttribute("role", "Admin");
        return "dashboard";
    }
}
