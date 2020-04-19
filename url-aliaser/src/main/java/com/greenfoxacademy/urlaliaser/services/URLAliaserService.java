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

    public URLAliaser findByAlias(String alias){
       return urlAliaserRepository.findByAlias(alias);
    }

    public Iterable<URLAliaser> findAll(){
        return urlAliaserRepository.findAll();
    }

    public boolean isAliasTaken(String alias){
        return urlAliaserRepository.findByAlias(alias) != null;
    }

    public void saveURLAndAlias(URLAliaser urlAliaser){
            urlAliaserRepository.save(urlAliaser);
    }
}


