package com.greenfoxacademy.mysql_project.services;

import com.greenfoxacademy.mysql_project.models.Todo;
import com.greenfoxacademy.mysql_project.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Iterable<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Iterable<Todo> findAllByIsDone() {
        return todoRepository.findAllByIsDone(true);
    }

    public Iterable<Todo> findAllByIsNotDone() {
        return todoRepository.findAllByIsDone(false);
    }

    public void addTodo(String todo, LocalDate dueDate) {
        todoRepository.save(new Todo(todo,dueDate));
    }

    public void deleteTodo(long id) {
        todoRepository.deleteById(id);
    }

    public Todo findTodoById (long id) {
        Optional<Todo> optional = todoRepository.findById(id);

        if(optional.isPresent()){
            return optional.get();
        } else {
            return null;
        }
    }

    public void saveTodo(Todo todo){
        todoRepository.save(todo);
    }

    public Iterable<Todo> search(String searchInput){
        return todoRepository.findAllByTitleContains(searchInput);
    }
}