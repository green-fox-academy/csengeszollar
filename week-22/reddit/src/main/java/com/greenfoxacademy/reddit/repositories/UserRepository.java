package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByName(String name);
    Optional<User> findById(Long id);
    Optional<User> findByNameAndPassword(String name, String password);
}
