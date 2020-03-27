package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.Doubling;
import com.greenfoxacademy.rest.models.ErrorMessage;
import com.greenfoxacademy.rest.models.Greeting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping(value = "/doubling")
    public ResponseEntity doubling(@RequestParam(required = false)Integer input) {
        if (input == null ) {
            return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
        } else {
            Doubling doubling = new Doubling(input);
            return ResponseEntity.status(200).body(doubling);
        }
    }

    @GetMapping(value = "/greeter")
    public ResponseEntity greeter(@RequestParam(required = false)String name, @RequestParam(required = false) String title){
        if (name == null && title == null){
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name and a title!"));
        } else if (title == null) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a title!"));
        } else {
            Greeting greeting = new Greeting(name, title);
            return ResponseEntity.status(200).body(greeting);
        }

    }

}
