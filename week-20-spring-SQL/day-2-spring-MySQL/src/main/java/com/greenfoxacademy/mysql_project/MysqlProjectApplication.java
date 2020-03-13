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
        Assignee joci = assigneeRepository.save(new Assignee("Joci", "joci@joamoci.hu"));
        Assignee pisti = new Assignee("Pityu", "pityesz@gmail.com");
        Assignee klari = new Assignee("Klari", "klari@gmail.com");
        Assignee mari = new Assignee("Mari", "mari@gmail.com");
        Assignee agi = new Assignee("Agi", "agi@gmail.com");

        assigneeRepository.save(pisti);
        assigneeRepository.save(klari);
        assigneeRepository.save(mari);
        assigneeRepository.save(agi);

        todoRepository.save(new Todo("daily task",false,false, joci));
        todoRepository.save(new Todo("make beds", true, true, pisti));
        todoRepository.save(new Todo("do the washing up", false, true, klari));
        todoRepository.save(new Todo("clean the bathroom and the kitchen", true, true, mari));
        todoRepository.save(new Todo("wipe all the surfaces with a cloth", false, true, agi));
        todoRepository.save(new Todo("vacuum the carpet", false, false, joci));

    }
}
