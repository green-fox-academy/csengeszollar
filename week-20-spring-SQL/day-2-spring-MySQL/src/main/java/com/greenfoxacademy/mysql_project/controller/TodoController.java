package com.greenfoxacademy.mysql_project.controller;

import com.greenfoxacademy.mysql_project.models.Todo;
import com.greenfoxacademy.mysql_project.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(required = false) String isActive) {
        if (isActive == null) {
            model.addAttribute("todos", todoService.findAll());
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
    public String saveNewTodo(@ModelAttribute(name = "title") String todo) {
        todoService.addTodo(todo);
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
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String saveEditedTodo(@ModelAttribute Todo todo){
        todoService.saveTodo(todo);
       return "redirect:/todo/list";
    }
}
