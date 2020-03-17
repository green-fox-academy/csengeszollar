package com.greenfoxacademy.mysql_project.repository;

import com.greenfoxacademy.mysql_project.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    Iterable<Todo> findAllByIsDone(boolean isActive);
    Iterable<Todo> findAllByTitleContains(String searchInput);
    Iterable<Todo> findAllByDateOfCreation(LocalDate inputDate);
    Iterable<Todo> findAllByAssigneeName(String inputName);
    Iterable<Todo> findAllByDueDate(LocalDate inputDueDate);
}