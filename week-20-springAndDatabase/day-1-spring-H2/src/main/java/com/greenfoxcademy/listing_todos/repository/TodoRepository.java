package com.greenfoxcademy.listing_todos.repository;

import com.greenfoxcademy.listing_todos.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository <Todo, Long> {
}
