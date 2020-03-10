package com.greenfoxacademy.mysql_project.controller;

import com.greenfoxacademy.mysql_project.services.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AssigneeController {

  private AssigneeService assigneeService;

    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/assignee")
    public String renderListOfAssignees(Model model){
        model.addAttribute("assignees", assigneeService.findAll());
        return "assignee";
    }

    @GetMapping("/assignee/{email}/delete")
    public String deleteAssignee(@PathVariable(name = "email") String email) {
        assigneeService.delete(email);
        return "redirect:/assignee";
    }

    @GetMapping("/assignee/{email}/edit")
    public String renderEditForm(@PathVariable(name = "email") String email, Model model) {
        model.addAttribute("email", email);
        model.addAttribute("assignee", assigneeService.findAssigneeById(email));
        return "edit-assignee";
    }
}
