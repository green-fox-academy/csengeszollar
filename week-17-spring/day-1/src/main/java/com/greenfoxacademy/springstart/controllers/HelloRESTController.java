package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
//    @RequestMapping(value="/greeting", method= RequestMethod.GET)
//public Greeting greeting() {
//    return new Greeting(1, "Hello World!");
//}
    AtomicLong atomicIncrement = new AtomicLong();

//    @GetMapping("/greeting")
//    public Greeting greeting(@RequestParam (value = "name", required = false) String name){
//        if (name == null) {
//            name = "Give me a name!";
//        }
//        return new Greeting(1, "Hello, " + name + "!");
//    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam (value = "name", required = false) String name){
        if (name == null) {
            name = "Give me a name!";
        }
        return new Greeting(atomicIncrement.incrementAndGet(), "Hello, " + name + "!");
    }
}

