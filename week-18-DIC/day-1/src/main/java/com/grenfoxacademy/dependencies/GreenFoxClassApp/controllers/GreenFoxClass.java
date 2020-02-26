package com.grenfoxacademy.dependencies.GreenFoxClassApp.controllers;

import com.grenfoxacademy.dependencies.GreenFoxClassApp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreenFoxClass {

    StudentService studentService;

    @Autowired
    public GreenFoxClass(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String renderMainPage() {
        return "gfaMain-links";
    }

    @GetMapping("/gfa/list")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.findAll());
        return "student-list";
    }

    @GetMapping("/gfa/add")
    public String addStudent(){
        return "add-student";
    }

    @GetMapping("/gfa/save")
    public String addNewStudentToList(@ModelAttribute String studentName) {
        studentService.save(studentName);
        return "redirect:/gfa/list";
    }



}
