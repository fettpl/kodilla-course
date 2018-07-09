package com.kodilla.spring.forum;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class ForumUser {
    protected String username;

    public ForumUser(String username) {
        this.username = "John Smith";
    }
}
