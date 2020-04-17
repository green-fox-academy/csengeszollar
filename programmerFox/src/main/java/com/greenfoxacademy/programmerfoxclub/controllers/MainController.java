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
    public String renderIndexPage(Model model, @RequestParam(required = false) String name) {    //ide kell request param? @RequestParam(required = false) String name, vagy eleg a string name?
        if (foxService.findFox(name) == null || name == null || name.equals("")){
//            model.addAttribute("error", "You have provided a name that has not been used before, add it as a new one!");
            return "redirect:/login";
        } else {
            model.addAttribute("fox", foxService.findFox(name));
//            model.addAttribute("name", name);
//            model.addAttribute("food", foxService.findFox(name).getFood());
//            model.addAttribute("drink", foxService.findFox(name).getDrink());
//            model.addAttribute("tricks", foxService.findFox(name).getTricks());
            return "index";
        }
    }

    @GetMapping("/login")
    public String renderLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String renderPostLogin(@RequestParam(required = false) String name) {  //ide kell a request param? tehat: @RequestParam(required = false) String name
        foxService.save(name);
        return "redirect:/?name=" + name;
    }


}