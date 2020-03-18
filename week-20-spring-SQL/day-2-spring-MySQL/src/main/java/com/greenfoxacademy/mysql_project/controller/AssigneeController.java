package com.greenfoxacademy.mysql_project.controller;

import com.greenfoxacademy.mysql_project.models.Assignee;
import com.greenfoxacademy.mysql_project.services.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  private AssigneeService assigneeService;

    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/")
    public String renderListOfAssignees(Model model){
        model.addAttribute("assignees", assigneeService.findAll());
        return "assignee";
    }

    @GetMapping("/{email}/delete")
    public String deleteAssignee(@PathVariable(name = "email") String email) {
        assigneeService.delete(email);
        return "redirect:/assignee";
    }

    @GetMapping("/{email}/edit")
    public String renderEditForm(@PathVariable(name = "email") String email, Model model) {
        model.addAttribute("assignee", assigneeService.findAssigneeById(email));
        return "edit-assignee";
    }

    @PostMapping("/{email}/edit")
    public String saveEditedAssignee(@ModelAttribute Assignee assignee){
        assigneeService.saveAssignee(assignee);
        return "redirect:/assignee/";
    }

    @GetMapping("/add")
    public String addAssignee(){
        return "add-assignee";
    }

    @PostMapping("/save")
    public String saveAssignee(@ModelAttribute Assignee assignee) {
        assigneeService.saveAssignee(assignee);
        return "redirect:/assignee";
    }

    @GetMapping("/{email}/todos")
    public String listAssignedTodos(Model model,@PathVariable(name = "email", required = false) String email) {
        model.addAttribute("todos", assigneeService.getAssignedTodos(email));
        model.addAttribute("assignee", assigneeService.findAssigneeById(email));
        return "assigned-todos";
    }
}
