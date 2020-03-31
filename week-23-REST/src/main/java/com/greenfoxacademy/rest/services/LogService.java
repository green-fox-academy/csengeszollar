package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.Log;
import com.greenfoxacademy.rest.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    private LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public void addLog(Log log) {
        logRepository.save(log);
    }

    public Iterable<Log> findAll(){
        return logRepository.findAll();
    }
}
