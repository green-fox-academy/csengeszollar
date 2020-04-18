package com.greenfoxacademy.urlaliaser.services;

import com.greenfoxacademy.urlaliaser.models.URLAliaser;
import com.greenfoxacademy.urlaliaser.repositories.URLAliaserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class URLAliaserService {

    private URLAliaserRepository urlAliaserRepository;

    @Autowired
    public URLAliaserService(URLAliaserRepository urlAliaserRepository) {
        this.urlAliaserRepository = urlAliaserRepository;
    }

    public Iterable<URLAliaser> findAll(){
        return urlAliaserRepository.findAll();
    }

    public boolean isAliasTaken(String alias){
        return urlAliaserRepository.findAllByAlias(alias) != null;
    }

    public void saveURLAndAlias(URLAliaser urlAliaser){
        if (!isAliasTaken(urlAliaser.getAlias())) {
            urlAliaserRepository.save(urlAliaser);
        }
    }
}


