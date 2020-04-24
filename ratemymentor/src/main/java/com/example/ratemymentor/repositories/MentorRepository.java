package com.example.ratemymentor.repositories;

import com.example.ratemymentor.models.Mentor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MentorRepository extends CrudRepository<Mentor, Long> {
    Optional<Mentor> findByName(String name);
}
