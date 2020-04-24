package com.example.ratemymentor.repositories;

import com.example.ratemymentor.models.ClassName;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClassNameRepository extends CrudRepository<ClassName, Long> {
    Optional<ClassName> findByName(String name);
}
