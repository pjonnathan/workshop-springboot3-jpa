package com.startproject.demo.config;

import com.startproject.demo.entity.User;
import com.startproject.demo.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Joca", "joca@gmail.com", "999999999", "123456789");
        User u2 = new User(null, "baca", "beca@gmail.com", "988888888", "12345634");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
