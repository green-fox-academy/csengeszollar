package com.greenfoxacademy.mysql_project;

import com.greenfoxacademy.mysql_project.models.Todo;
import com.greenfoxacademy.mysql_project.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlProjectApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    MysqlProjectApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MysqlProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    }
}
