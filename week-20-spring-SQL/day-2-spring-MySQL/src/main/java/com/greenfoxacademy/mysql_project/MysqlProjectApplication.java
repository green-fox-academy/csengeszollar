package com.greenfoxacademy.mysql_project;

import com.greenfoxacademy.mysql_project.models.Assignee;
import com.greenfoxacademy.mysql_project.models.Todo;
import com.greenfoxacademy.mysql_project.repository.AssigneeRepository;
import com.greenfoxacademy.mysql_project.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlProjectApplication implements CommandLineRunner {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    MysqlProjectApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MysqlProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("daily task",false,false));
        todoRepository.save(new Todo("make beds", true, true));
        todoRepository.save(new Todo("do the washing up", false, true));
        todoRepository.save(new Todo("clean the bathroom and the kitchen", true, true));
        todoRepository.save(new Todo("wipe all the surfaces with a cloth", false, true));
        todoRepository.save(new Todo("vacuum the carpet", false, false));
        assigneeRepository.save(new Assignee("Joci", "joci@joamoci.hu"));
    }
}
