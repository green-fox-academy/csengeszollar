package com.greenfoxacademy.urlaliaser.services;

import com.greenfoxacademy.urlaliaser.models.SecretCode;
import com.greenfoxacademy.urlaliaser.models.URLAliaser;
import com.greenfoxacademy.urlaliaser.repositories.URLAliaserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class URLAliaserService {

    private URLAliaserRepository urlAliaserRepository;

    @Autowired
    public URLAliaserService(URLAliaserRepository urlAliaserRepository) {
        this.urlAliaserRepository = urlAliaserRepository;
    }

    public URLAliaser findByAlias(String alias) {
        Optional<URLAliaser> optional = urlAliaserRepository.findByAlias(alias);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }

    public Iterable<URLAliaser> findAll() {
        return urlAliaserRepository.findAll();
    }

    public boolean isAliasTaken(String alias) {
        return findByAlias(alias) != null;
    }

    public void saveURLAndAlias(URLAliaser urlAliaser) {
        urlAliaserRepository.save(urlAliaser);
    }

    public void deleteURLAlias(long id) {
        urlAliaserRepository.deleteById(id);
    }

    public URLAliaser findById(long id) {
        Optional<URLAliaser> optional = urlAliaserRepository.findById(id);
        return optional.orElse(null);
    }

    public URLAliaser findBySecretCode(int secretCode) {
        return urlAliaserRepository.findBySecretCode(secretCode);
    }

    public boolean doesSecretCodeExist(SecretCode secretCode) {
        return urlAliaserRepository.findBySecretCode(secretCode.getSecretCode()) != null;
    }

    public void incrementHitCount(String alias) {
        URLAliaser urlAliaser = findByAlias(alias);
        urlAliaser.setHitCount(urlAliaser.getHitCount() + 1);
        urlAliaserRepository.save(urlAliaser);
    }

}


