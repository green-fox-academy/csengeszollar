package com.greenfoxacademy.urlaliaser.controllers;

import com.greenfoxacademy.urlaliaser.models.SecretCode;
import com.greenfoxacademy.urlaliaser.services.URLAliaserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

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

    @DeleteMapping(value = "/api/links/{id}")
    public ResponseEntity deletingEntries(@PathVariable long id, @RequestBody SecretCode secretCode) {
        if (!urlAliaserService.doesSecretCodeExist(secretCode)) {
            return ResponseEntity.notFound().build();
        } else {
            if (urlAliaserService.findById(id).getSecretCode() != secretCode.getSecretCode()) {
//                return ResponseEntity.status(403).body(new ErrorMessage("The given secret code doesn't match with the URL"));
                return ResponseEntity.status(403).body(HttpServletResponse.SC_FORBIDDEN);
            } else {
                urlAliaserService.deleteURLAlias(id);
                return ResponseEntity.noContent().build();
            }
        }
    }
}
