package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.*;

import com.greenfoxacademy.rest.services.LogService;
import com.greenfoxacademy.rest.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class ApiController {

    private RestService service;
    private LogService logService;

    @Autowired
    public ApiController(RestService service, LogService logService) {
        this.service = service;
        this.logService = logService;
    }

    @GetMapping(value = "/doubling")
    public ResponseEntity doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
        } else {
            Doubling doubling = new Doubling(input);
            Log log = new Log("/doubling", "input" + input);
            logService.addLog(log);
            return ResponseEntity.status(200).body(doubling);
        }
    }

    @GetMapping(value = "/greeter")
    public ResponseEntity greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        Log log = new Log("/greeter", name + ", " + title);
        logService.addLog(log);
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
        Log log = new Log("/appenda", appendable);
        logService.addLog(log);
        if (appendable == null) {
            return ResponseEntity.status(404).body(new ErrorMessage("404"));
        } else {
            AppendA appendA = new AppendA(appendable);
            return ResponseEntity.status(200).body(appendA);
        }
    }

    @PostMapping(value = "/dountil/{action}")
    public ResponseEntity doUntil(@PathVariable(name = "action") String action, @RequestBody DoUntil until) {
        Log log = new Log("/dountil", action + ", " + until.getUntil());
        logService.addLog(log);
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

    @PostMapping(value = "/arrays")
    public ResponseEntity arrayHandler(@RequestBody ArrayHandler handler) {
        logService.addLog(new Log("/arrays", handler.getWhat() + " numbers " + Arrays.toString(handler.getNumbers())));
        if (handler.getWhat().equals("sum") || handler.getWhat().equals("multiply")) {
            return ResponseEntity.status(200).body(new Result(service.arrayHandler(handler, handler.getWhat())));
        } else if (handler.getWhat().equals("double")) {
            return ResponseEntity.status(200).body(new ArrayResult(service.doublingArrayHandler(handler)));
        } else {
            return ResponseEntity.status(404).body(new ErrorMessage("Please provide what to do with the numbers!"));
        }
    }

    @GetMapping(value = "/log")
    public ResponseEntity logs() {
        LogResult logResult = new LogResult(logService.findAll());
        return ResponseEntity.status(200).body(logResult);
    }
}
