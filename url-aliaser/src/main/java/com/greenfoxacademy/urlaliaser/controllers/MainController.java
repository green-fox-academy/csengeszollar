package com.greenfoxacademy.urlaliaser.controllers;

import com.greenfoxacademy.urlaliaser.models.URLAliaser;
import com.greenfoxacademy.urlaliaser.services.URLAliaserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private URLAliaserService urlAliaserService;

    @Autowired
    public MainController(URLAliaserService urlAliaserService) {
        this.urlAliaserService = urlAliaserService;
    }

    @GetMapping("/")
    public String renderIndexPage(@RequestParam(required = false) String message, @RequestParam(required = false) String url, @RequestParam(required = false) String alias, Model model) {
        if (message != null) {
            if (message.equals("error")) {
                model.addAttribute("url", url);
                model.addAttribute("alias", alias);
                model.addAttribute("error", "Your alias is already in use!");
            } else if (message.equals("success")) {
                model.addAttribute("urlAliaser", urlAliaserService.findByAlias(alias));
            }
        }
        return "index";
    }

    @PostMapping("/save-link")
    public String addAliasToURL(@ModelAttribute URLAliaser urlAliaser, Model model) {
        if (!urlAliaserService.isAliasTaken(urlAliaser.getAlias())) {
            urlAliaserService.saveURLAndAlias(urlAliaser);
//            model.addAttribute("succes", urlAliaser);
            return "redirect:/?message=success&alias=" + urlAliaser.getAlias();
        } else {
            return "redirect:/?message=error&url=" + urlAliaser.getUrl() + "&alias=" + urlAliaser.getAlias();
//            model.addAttribute("error", "Your alias is already in use");
        }
    }

    @GetMapping("/a/{alias}")
    public String incrementHitCount(@PathVariable String alias) {
        if (urlAliaserService.isAliasTaken(alias)) {
            urlAliaserService.incrementHitCount(alias);
            return "redirect:" + urlAliaserService.findByAlias(alias).getUrl();
        } else {
            return "redirect:/";
        }

    }
}
