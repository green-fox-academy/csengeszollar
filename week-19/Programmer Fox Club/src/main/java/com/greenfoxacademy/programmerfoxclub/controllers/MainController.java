package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String renderIndexPage(Model model, @RequestParam(required = false) String name) {
        model.addAttribute("name", name);
        model.addAttribute("food", foxService.findFox(name).getFood());
        model.addAttribute("drink", foxService.findFox(name).getDrink());
        model.addAttribute("tricks", foxService.findFox(name).getTricks());
        return "index";
    }

    @GetMapping("/login")
    public String renderLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String renderPostLogin(@RequestParam String name) {
        return "redirect:/?name=" + name;
    }

}
