package com.greenfoxcademy.listing_todos;

import com.greenfoxcademy.listing_todos.models.Todo;
import com.greenfoxcademy.listing_todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingTodosApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    ListingTodosApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(ListingTodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));

    }
}
