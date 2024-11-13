package com.et.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World!");
        return "main";
    }

    @RequestMapping("/hello2")
    public ModelAndView hello2(Model model) {
        ModelAndView m = new ModelAndView();
        m.addObject("abcd");
        return m;
    }
}