package com.greenfoxacademy.mysql_project.services;

import com.greenfoxacademy.mysql_project.models.Todo;
import com.greenfoxacademy.mysql_project.repository.AssigneeRepository;
import com.greenfoxacademy.mysql_project.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
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

    public void addTodo(String todo, String dueDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate inputDate = LocalDate.parse(dueDate, formatter);
        todoRepository.save(new Todo(todo, inputDate));
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

    public Iterable<Todo> searchTitle(String searchInput){
        return todoRepository.findAllByTitleContains(searchInput);
    }

    public Iterable<Todo> search(String key, String field){
        switch (key) {
            case "title":
                return todoRepository.findAllByTitleContains(field);

            case "assigneeName":
                return todoRepository.findAllByAssignee(assigneeRepository.findAssigneeByNameContains(field));

            case "creationDate":
                return searchByCreationDate(field);

            case "dueDate":
                return searchByDueDate(field);

            default:
                return null;
        }
    }

    public Iterable<Todo> searchByCreationDate(String field) {
//        List<Todo> filteredTodos = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate creationDate = LocalDate.parse(field, formatter);
//        for (Todo todo: findAll()){
//            if (todo.getDateOfCreation() !=null) {
//                if (todo.getDateOfCreation().compareTo(creationDate) == 0) {
//                    filteredTodos.add(todo);
//                }
//            }
//        }
//        return filteredTodos;
        return todoRepository.findAllByDateOfCreation(creationDate);
    }

    public Iterable<Todo> searchByDueDate(String field) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dueDate = LocalDate.parse(field, formatter);
        return todoRepository.findAllByDueDate(dueDate);
    }
}