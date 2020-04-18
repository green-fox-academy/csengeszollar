package com.greenfoxacademy.urlaliaser.controllers;

import com.greenfoxacademy.urlaliaser.models.URLAliaser;
import com.greenfoxacademy.urlaliaser.services.URLAliaserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private URLAliaserService urlAliaserService;

    @Autowired
    public MainController(URLAliaserService urlAliaserService) {
        this.urlAliaserService = urlAliaserService;
    }

    @GetMapping("/")
    public String renderIndexPage() {
        return "index";
    }

    @PostMapping("/save-link")
    public String addAliasToURL(@ModelAttribute URLAliaser urlAliaser){
        urlAliaserService.saveURLAndAlias(urlAliaser);
        return "redirect:/";
    }
}
