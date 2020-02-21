package com.grenfoxacademy.dependencies.GreenFoxClassApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenFoxClass {
    @GetMapping("/gfa")
    public String renderMainPage(){
        return "gfaMain-links";
    }
}
