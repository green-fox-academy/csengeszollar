package com.example.ratemymentor.controllers;

import com.example.ratemymentor.models.ClassName;
import com.example.ratemymentor.models.Mentor;
import com.example.ratemymentor.services.ClassNameService;
import com.example.ratemymentor.services.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MentorController {

    private MentorService mentorService;
    private ClassNameService classNameService;

    @Autowired
    public MentorController(MentorService mentorService, ClassNameService classNameService) {
        this.mentorService = mentorService;
        this.classNameService = classNameService;
    }

    @GetMapping("/")
    public String renderIndexToListMentors(Model model) {
        model.addAttribute("mentors", mentorService.findAll());
        model.addAttribute("classNames", classNameService.findAll());
        return "index";
    }

    @PostMapping("/mentor")
    public String saveMentor(@ModelAttribute Mentor mentor,
            Model model) {
        if (mentorService.findMentorByName(mentor.getName()) != null) {
            model.addAttribute("existsAlready", "The mentor is already exists, please contact us if you can't find him/her in the list!");
            return "error";
        } else if (mentor.getName().equals("")) {
            model.addAttribute("emptyName", "Please don't leave the name field empty!");
            return "error";
        } else {
            mentorService.addMentor(mentor);
            classNameService.addClassToMentor(mentor);
            return "redirect:/mentor/" + mentor.getId();
        }
    }

    @GetMapping("/mentor/{id}")
    public String renderMentorEvaluationPage(@PathVariable Long id, Model model) {
        if (mentorService.findMentorById(id) != null) {
            model.addAttribute("mentor", mentorService.findMentorById(id));
            return "evaluation-form";
        } else {
            model.addAttribute("doesntExists", "Sorry but there isn't any mentor with this id");
            return "error";
        }
    }

}

