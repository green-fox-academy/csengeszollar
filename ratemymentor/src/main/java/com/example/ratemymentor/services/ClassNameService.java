package com.example.ratemymentor.services;

import com.example.ratemymentor.models.ClassName;
import com.example.ratemymentor.models.Mentor;
import com.example.ratemymentor.repositories.ClassNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassNameService {

    private ClassNameRepository classNameRepository;

    @Autowired
    public ClassNameService(ClassNameRepository classNameRepository) {
        this.classNameRepository = classNameRepository;
    }

    public Iterable<ClassName> findAll(){
        return classNameRepository.findAll();
    }

    public ClassName findClassByName(String name){
        Optional<ClassName> className= classNameRepository.findByName(name);
        return className.orElse(null);
    }

    public void addClassToMentor(Mentor mentor){
        ClassName className = findClassByName(mentor.getClassName());
        className.addMentor(mentor);
        mentor.setNamesOfClass(className);
        classNameRepository.save(className);
    }




}
