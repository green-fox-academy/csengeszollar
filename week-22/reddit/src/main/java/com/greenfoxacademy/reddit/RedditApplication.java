package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    private PostRepository postRepository;

    @Autowired
    RedditApplication(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        postRepository.save(new Post("covid-19", "https://koronavirus.gov.hu/"));
        postRepository.save(new Post("Eszenyi botrany", "https://librarius.hu/2020/03/13/eszenyi-enikot-szineszek-megalazasaval-vadoljak-de-o-maradhat-a-vigszinhaz-igazgatoja/"));
    }
}
