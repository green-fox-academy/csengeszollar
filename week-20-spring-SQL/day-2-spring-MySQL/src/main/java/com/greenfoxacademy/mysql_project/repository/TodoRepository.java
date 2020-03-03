package com.greenfoxacademy.mysql_project.repository;

import com.greenfoxacademy.mysql_project.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}