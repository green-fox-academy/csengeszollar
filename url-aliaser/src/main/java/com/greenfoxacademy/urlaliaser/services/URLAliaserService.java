package com.greenfoxacademy.urlaliaser.services;

import com.greenfoxacademy.urlaliaser.models.SecretCode;
import com.greenfoxacademy.urlaliaser.models.URLAliaser;
import com.greenfoxacademy.urlaliaser.repositories.URLAliaserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class URLAliaserService {

    private URLAliaserRepository urlAliaserRepository;

    @Autowired
    public URLAliaserService(URLAliaserRepository urlAliaserRepository) {
        this.urlAliaserRepository = urlAliaserRepository;
    }

    public URLAliaser findByAlias(String alias) {
        return urlAliaserRepository.findByAlias(alias);
    }

    public Iterable<URLAliaser> findAll() {
        return urlAliaserRepository.findAll();
    }

    public boolean isAliasTaken(String alias) {
        return urlAliaserRepository.findByAlias(alias) != null;
    }

    public void saveURLAndAlias(URLAliaser urlAliaser) {
        urlAliaserRepository.save(urlAliaser);
    }

    public void deleteURLAlias(long id) {
        urlAliaserRepository.deleteById(id);
    }

    public URLAliaser findById(long id) {
        return urlAliaserRepository.findById(id);
    }

    public URLAliaser findBySecretCode(int secretCode) {
        return urlAliaserRepository.findBySecretCode(secretCode);
    }

    public boolean doesSecretCodeExist(SecretCode secretCode) {
        return urlAliaserRepository.findBySecretCode(secretCode.getSecretCode()) != null;
    }
}


