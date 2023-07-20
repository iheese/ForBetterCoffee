package com.forbettercoffee.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class PageController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/recipe")
    public ModelAndView recipe() {
        ModelAndView mv = new ModelAndView("pages/recipe");
        mv.addObject("");
        return mv;
    }

    @GetMapping("/cafe")
    public String cafe() {
        return "pages/cafe";
    }
}