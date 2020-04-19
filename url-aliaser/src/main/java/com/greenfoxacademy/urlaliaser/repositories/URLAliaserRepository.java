package com.greenfoxacademy.urlaliaser.repositories;

import com.greenfoxacademy.urlaliaser.models.URLAliaser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLAliaserRepository extends CrudRepository<URLAliaser, Long> {
    URLAliaser findByAlias(String alias);

}
