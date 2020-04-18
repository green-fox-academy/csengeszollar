package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.Trick;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FoxController {
    private FoxService foxService;

    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/nutritionStore")
    public String renderNutritionStorePage(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        model.addAttribute("foods", Food.getFoods());
        model.addAttribute("drinks", Drink.drinkList());
        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String setFoodAndDrink(@RequestParam String name, String food, String drink) {
        foxService.setFoodAndDrink(name, food, drink);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/trickCenter")
    public String renderTrickCenterPage(@RequestParam String name, Model model){
        model.addAttribute("name", name);
        model.addAttribute("tricks", foxService.findFox(name).removingTricksFoxAlreadyKnows());
        return "trickCenter";
    }

    @PostMapping("/trickCenter")
    public String learningNewTricks(@RequestParam String name, String prick){
        foxService.learningNewTrick(name, prick);
        return "redirect:/?name=" + name;
    }
}
