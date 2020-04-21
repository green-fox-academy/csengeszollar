package com.greenfoxacademy.urlaliaser.repositories;

import com.greenfoxacademy.urlaliaser.models.URLAliaser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface URLAliaserRepository extends CrudRepository<URLAliaser, Long> {

    URLAliaser findBySecretCode(int secretCode);

    Optional<URLAliaser> findByAlias(String alias);
}
