package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    List<Fox> foxes;

    public FoxService() {
        foxes = new ArrayList<>();
        foxes.add(new Fox("Berci"));
        foxes.add(new Fox("Marci"));
        foxes.add(new Fox("Borka"));
    }

    public Fox findFox(String name) {
        for (int i = 0; i < foxes.size(); i++) {
            if (foxes.get(i).getName().equals(name)) {
                return foxes.get(i);
            }
        }
        return null;
    }

    public void save(String name) {
        if (findFox(name) == null) {
            foxes.add(new Fox(name));
        }
    }
}
