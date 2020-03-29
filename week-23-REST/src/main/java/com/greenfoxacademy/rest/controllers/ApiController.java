package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {
    @GetMapping(value = "/doubling")
    public ResponseEntity doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
        } else {
            Doubling doubling = new Doubling(input);
            return ResponseEntity.status(200).body(doubling);
        }
    }

    @GetMapping(value = "/greeter")
    public ResponseEntity greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null && title == null) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name and a title!"));
        } else if (title == null) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a title!"));
        } else if (name == null) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name!"));
        } else {
            Greeting greeting = new Greeting(name, title);
            return ResponseEntity.status(200).body(greeting);
        }
    }

    @GetMapping(value = "/appenda/{appendable}")
    public ResponseEntity appendA(@PathVariable(name = "appendable") String appendable) {
        if (appendable == null) {
            return ResponseEntity.status(404).body(new ErrorMessage("404"));
        } else {
            AppendA appendA = new AppendA(appendable);
            return ResponseEntity.status(200).body(appendA);
        }
    }

    @PostMapping(value = "/dountil/{action}")
    public ResponseEntity doUntil(@PathVariable(name = "action") String action, @RequestBody DoUntil until) {
        if (until == null) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a number!"));
        } else if (action.equals("sum")) {
            until.sum();
            return ResponseEntity.status(200).body(until);
        } else if (action.equals("factor")) {
            until.factor();
            return ResponseEntity.status(200).body(until);
        } else {
            return ResponseEntity.status(404).body(new ErrorMessage("No action found"));
        }
    }
}
