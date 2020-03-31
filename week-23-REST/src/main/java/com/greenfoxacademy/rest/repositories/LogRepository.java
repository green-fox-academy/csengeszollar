package com.greenfoxacademy.rest.repositories;

import com.greenfoxacademy.rest.models.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Long> {
}
