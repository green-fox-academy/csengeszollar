package com.greenfoxacademy.mysql_project.repository;

import com.greenfoxacademy.mysql_project.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, String> {
    Assignee findAssigneeByNameContains(String name);
}
