package com.greenfoxacademy.mysql_project.repository;

import com.greenfoxacademy.mysql_project.models.Assignee;
import com.greenfoxacademy.mysql_project.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    Iterable<Todo> findAllByIsDone(boolean isActive);
    Iterable<Todo> findAllByTitleContains(String searchInput);
//    Iterable<Todo> findAllByTitleContains(String searchInput);
    Iterable<Todo> findAllByIsDoneAndDateOfCreation(boolean isActive, LocalDate inputDate);
    Iterable<Todo> findAllByAssignee(Assignee assignee);
    Iterable<Todo> findAllByIsDoneAndDueDate(boolean isActive, LocalDate inputDueDate);
    Iterable<Todo> findAllByDateOfCreation(LocalDate inputDate);
    Iterable<Todo> findAllByDueDate(LocalDate inputDate);
//    Iterable<Todo> findAllByIsDoneAndTitleContainsAAndDateOfCreationAndAssigneeAndDueDate(boolean isActive, String searchInput, LocalDate inputDate,Assignee assignee, LocalDate inputDueDate );
}