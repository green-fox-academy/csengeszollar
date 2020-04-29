package com.example.ratemymentor.services;

import com.example.ratemymentor.models.ClassName;
import com.example.ratemymentor.models.Mentor;
import com.example.ratemymentor.repositories.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MentorService {
    private MentorRepository mentorRepository;

    @Autowired
    public MentorService(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    public Iterable<Mentor> findAll() {
        return mentorRepository.findAll();
    }

    public void addMentor(Mentor mentor) {
        mentorRepository.save(mentor);
    }

    public Mentor findMentorByName(String name) {
        Optional<Mentor> mentor = mentorRepository.findByName(name);
        return mentor.orElse(null);
    }

    public Mentor findMentorById(Long id) {
        Optional<Mentor> mentor = mentorRepository.findById(id);
        return mentor.orElse(null);
    }

}
