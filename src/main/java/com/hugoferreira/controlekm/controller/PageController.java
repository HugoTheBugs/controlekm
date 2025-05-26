package com.hugoferreira.controlekm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/link-expression")
    public String linkExpressionDemo(Model model){
        model.addAttribute("id", 1);
        return "link-expression";
    }
}
