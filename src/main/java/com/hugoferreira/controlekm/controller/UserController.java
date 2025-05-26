package com.hugoferreira.controlekm.controller;

import com.hugoferreira.controlekm.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

//    @GetMapping("/dashboard")
//    public String showDashboard(Model model){
//
//        model.addAttribute("userName", "Hugo Ferreira");
//        model.addAttribute("role", "Admin");
//        return "dashboard";
//    }

    @GetMapping("/message-expression")
    public String showMessageExpression(){
        return "message-expression";
    }

    @GetMapping("/dashboard")
    public String showDashboard(Model model){
//        User adminUser = new User(1, "Hugo Ferreira", "hugo@fema.edu.br", "Admin");
        User guestUser = new User(1, "Hugo Ferreira", "hugo@fema.edu.br", "Unknown");
        model.addAttribute("user", guestUser);
        return "dashboard";
    }
}
