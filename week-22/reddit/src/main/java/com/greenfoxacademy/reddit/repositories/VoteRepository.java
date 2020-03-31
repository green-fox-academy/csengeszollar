package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {

}
