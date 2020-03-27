package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByName(String name) {
        Optional<User> optional = userRepository.findByName(name);
        return optional.orElse(null);
    }

    public User findByNameAndPassword(String name, String password) {
        Optional<User> optional = userRepository.findByNameAndPassword(name, password);
        return optional.orElse(null);
    }

    public void registerNewUser(User user) {
        userRepository.save(user);
    }

    public User findById(long id) {
        Optional<User> optional = userRepository.findById(id);
        return optional.orElse(null);
    }

    public void addNewPost(long userId, Post post) {
        User user = findById(userId);
        user.addPost(post);
        post.setUser(user);
        userRepository.save(user);
    }
}
