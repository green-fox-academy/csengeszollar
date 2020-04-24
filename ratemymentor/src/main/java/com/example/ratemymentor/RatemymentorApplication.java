package com.example.ratemymentor;

import com.example.ratemymentor.models.ClassName;
import com.example.ratemymentor.repositories.ClassNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RatemymentorApplication implements CommandLineRunner {

    private ClassNameRepository classNameRepository;

    @Autowired
    public RatemymentorApplication(ClassNameRepository classNameRepository) {
        this.classNameRepository = classNameRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RatemymentorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        classNameRepository.save(new ClassName("Tiptop"));
        classNameRepository.save(new ClassName("Roboto"));
        classNameRepository.save(new ClassName("Really"));
        classNameRepository.save(new ClassName("Seadog"));
    }
}
