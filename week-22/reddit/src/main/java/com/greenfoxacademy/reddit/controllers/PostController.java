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
    public String incrementVoting(Long postId, @PathVariable(name = "userId") Long userId) {
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
    public String decrementVoting(Long postId, @PathVariable(name = "userId") String userId) {
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
    public String renderSubmitPage(Model model, @PathVariable(name = "userId") Long userId) {
        model.addAttribute("user", userService.findById(userId));
        return "submit-post";
    }

    @PostMapping(value = "/{userId}/submit")
    public String submitNewPost(@ModelAttribute Post post, @PathVariable(name = "userId") Long userId) {
        post.setUser(userService.findById(userId));
        postService.addNewPost(post);
        userService.findById(userId).addPost(post);
        return "redirect:/" + userId;
    }
}
