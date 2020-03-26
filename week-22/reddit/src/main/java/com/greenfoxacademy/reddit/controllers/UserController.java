package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/login")
    public String renderSignInForm(){
        return "login";
    }

    @PostMapping(value = "/login")
    public String signIn(@RequestParam("name") String name, @RequestParam ("password") String password){
        User user = userService.findByNameAndPassword(name, password);
        if (user != null) {
            return "redirect:/" + user.getId();
        }else {
            return "redirect:/login";
        }
    }

    @GetMapping(value = "/register")
    public String renderRegisterNewUserPage(){
        return "register-user";
    }

    @PostMapping(value = "/register")
    public String registerNewUser(@ModelAttribute User user){
        userService.registerNewUser(user);
        return "redirect:/" + user.getId();
    }
}
