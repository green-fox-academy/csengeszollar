package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = "/")
    public String listOfPosts(Model model){
        model.addAttribute("posts", postService.findAll());
        return "postlists";
    }

    @GetMapping(value = "/submit")
    public String renderSubmitPage(){
        return "submit-post";
    }

    @PostMapping(value = "/submit")
    public String submitNewPost(String title, String URL){
        postService.addNewPost(title, URL);
        return "redirect:/";
    }
}
