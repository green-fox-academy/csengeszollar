package com.greenfoxacademy.mysql_project.controller;

import com.greenfoxacademy.mysql_project.models.Todo;
import com.greenfoxacademy.mysql_project.services.AssigneeService;
import com.greenfoxacademy.mysql_project.services.TodoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

   private TodoService todoService;
   private AssigneeService assigneeService;

    public TodoController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(required = false) String isActive, @RequestParam (required = false) String searchedField,@RequestParam (required = false) String searchInput) {
        if (isActive == null) {
            if (searchedField != null && searchInput != null) {
                model.addAttribute("todos", todoService.search(searchedField, searchInput));
            } else{
                model.addAttribute("todos", todoService.findAll());
            }
        } else if (isActive.toLowerCase().equals("true")) {
            model.addAttribute("todos", todoService.findAllByIsNotDone());
        } else if (isActive.toLowerCase().equals("false")) {
            model.addAttribute("todos", todoService.findAllByIsDone());
        } else {
            model.addAttribute("error", "Please write a valid query.");
        }
        return "todolist";
    }

    @GetMapping("/add")
    public String renderAdd() {
        return "add";
    }

    @PostMapping("/save")
    public String saveNewTodo(String title, String dueDate) {
        todoService.addTodo(title, dueDate);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String deleteTodo(@PathVariable(name = "id") Long id) {
        todoService.deleteTodo(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String renderEdit(@PathVariable(name = "id") Long id, Model model) {
       model.addAttribute("id", id);
       model.addAttribute("todo", todoService.findTodoById(id));
       model.addAttribute("assignees", assigneeService.findAll());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String saveEditedTodo(@ModelAttribute Todo todo){
        todoService.saveTodo(todo);
       return "redirect:/todo/list";
    }
}
