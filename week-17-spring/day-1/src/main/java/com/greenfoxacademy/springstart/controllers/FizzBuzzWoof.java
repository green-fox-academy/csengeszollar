package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class FizzBuzzWoof {

    private AtomicLong greetingCounter = new AtomicLong();
    int counter;
    int fontSize = 16;

    public String fizzBuzzWoof() {
       counter = (int) greetingCounter.incrementAndGet();
        if (counter % 105 == 0) {
            fontSize = 72;
            return "FizzBuzzWoof";
        }
         else if (counter % 15 == 0) {
            fontSize = 48;
            return "FizzBuzz";
        }
        else if (counter % 21 == 0) {
            fontSize = 48;
            return "FizzWoof";
        }
        else if (counter % 35 == 0) {
            fontSize = 48;
            return "BuzzWoof";
        }
       else if (counter % 7 == 0) {
            fontSize = 24;
            return "Woof";
        }
        else if (counter % 5 == 0) {
            fontSize = 24;
            return "Buzz";
        }
       else if (counter % 3 == 0) {
            fontSize = 24;
            return "Fizz";
        } else {
           fontSize = 16;
           return Integer.toString(counter);
        }

    }

    @GetMapping("/fizzbuzz")
    public String greeting(Model model) {

        model.addAttribute("counter", fizzBuzzWoof());
        model.addAttribute("size", fontSize);
        return "fizzBuzzWoof";
    }
}
