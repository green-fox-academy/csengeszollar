package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

//    @RequestMapping("/web/greeting")
//    public String greeting(Model model) {
//        model.addAttribute("name", " World");
//        return "greeting";
//    }

    private AtomicLong greetingCounter = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name == null) {
            name = "You";
        }
        model.addAttribute("name", name);
        model.addAttribute("counter", greetingCounter.incrementAndGet());
        return "greeting";
    }
}
