package com.greenfoxacademy.mysql_project.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.greenfoxacademy.mysql_project.models.Assignee;
import com.greenfoxacademy.mysql_project.services.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/assignee/{email}/edit")
    public String saveEditedAssignee(@ModelAttribute Assignee assignee){
        assigneeService.saveAssignee(assignee);
        return "redirect:/assignee";
    }

    @GetMapping("/assignee/add")
    public String addAssignee(){
        return "add-assignee";
    }

    @PostMapping("/assignee/save")
    public String saveAssignee(@ModelAttribute Assignee assignee) {
        assigneeService.saveAssignee(assignee);
        return "redirect:/assignee";
    }

    @GetMapping("/assignee/{email}/todos")
    public String listAssignedTodos(Model model,@PathVariable(name = "email", required = false) String email) {
        model.addAttribute("todos", assigneeService.getAssignedTodos(email));
        model.addAttribute("assignee", assigneeService.findAssigneeById(email));
        return "assigned-todos";
    }
}
