package com.greenfoxacademy.urlaliaser.controllers;

import com.greenfoxacademy.urlaliaser.services.URLAliaserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

    private URLAliaserService urlAliaserService;

    @Autowired
    public Rest(URLAliaserService urlAliaserService) {
        this.urlAliaserService = urlAliaserService;
    }

    @GetMapping(value = "/api/links")
    public ResponseEntity showStoredURLAlias() {
        return ResponseEntity.status(200).body(urlAliaserService.findAll());
    }
}
