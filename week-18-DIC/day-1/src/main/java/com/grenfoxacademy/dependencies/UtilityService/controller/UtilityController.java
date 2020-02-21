package com.grenfoxacademy.dependencies.UtilityService.controller;

import com.grenfoxacademy.dependencies.UtilityService.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

    private UtilityService utilityService;

    @Autowired
    public UtilityController (UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String utilities() {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String backgroundColor(Model model){
        model.addAttribute("backgroundColor", utilityService.randomColor());
        return "background-color";
    }

    @GetMapping("/useful/email")
    public String validEmail(@RequestParam(name = "email", required = false) String email, Model model) {
        model.addAttribute("email", utilityService.validateEmail(email));
        model.addAttribute("fontColor", utilityService.getFontColor());
        return "email-validation";
    }

    // public String validEmail(@RequestParam(name = "email", required = false) String email, Model model) {
    // model.addAttribute("email", utilityService.validateEmail(email) ? "valid" : "not valid");
//    model.addAttribute("color", utilityService.validateEmail(email) ? "green" : "red");
//    utilityService.validateEmail("riel@gfa.hu");


    @GetMapping("/useful/encoder")
    public String caesarEncoder(@RequestParam(name = "text", required = false) String text, @RequestParam(name = "number", required = false) Integer number, Model model) {
        model.addAttribute("caesar", utilityService.renderCaesar(text, number, true));
        return "caesar";
    }

    @GetMapping("/useful/decoder")
    public String caesarDecoder(@RequestParam(name = "text", required = false) String text, @RequestParam(name = "number", required = false) Integer number, Model model) {
        model.addAttribute("caesar", utilityService.renderCaesar(text, number, false));
        return "caesar";
    }







}
