package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    PostService postService;
    UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping(value = {"/", "/{userId}"})
    public String listOfPosts(Model model, @PathVariable(required = false, name = "userId") Long userId) {
        model.addAttribute("posts", postService.listingPostDescendingOrder());
        model.addAttribute("userId", userId);
        if (userId != null) {
            model.addAttribute("user", userService.findById(userId));
        }
        return "postlists";
    }

    @PostMapping(value = "/{userId}/upvote")
    public String incrementVoting(@RequestParam Long postId, @PathVariable(name = "userId") Long userId) {
        postService.incrementVoting(postId);
        return "redirect:/" + userId;

        //        if (userId != null) {
//            try {
//                Long userNumber = Long.parseLong(userId);
//                postService.incrementVoting(postId);
//                return "redirect:/" + userNumber;
//            } catch (NumberFormatException e) {
//                return "redirect:/login";
//            }
//        } else {
//            return "redirect:/login";
//        }
    }

    @PostMapping(value = "/{userId}/downvote")
    public String decrementVoting(@RequestParam Long postId, @PathVariable(name = "userId") String userId) {
        postService.decrementVoting(postId);
        return "redirect:/" + userId;
//        if (userId != null) {
//            try {
//                Long userNumber = Long.parseLong(userId);
//                postService.decrementVoting(postId);
//                return "redirect:/" + userNumber;
//            } catch (NumberFormatException e) {
//                return "redirect:/login";
//            }
//        } else {
//            return "redirect:/login";
//        }
    }

    @GetMapping(value = "/{userId}/submit")
    public String renderSubmitPage(@PathVariable(name = "userId") Long userId) {
        return "submit-post";
    }

    @PostMapping(value = "/{userId}/submit")
    public String submitNewPost(@ModelAttribute Post post, @PathVariable(name = "userId") Long userId) {
        postService.addNewPost(post);
        return "redirect:/" + userId;
    }
}
