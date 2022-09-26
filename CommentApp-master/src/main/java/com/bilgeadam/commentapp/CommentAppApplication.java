package com.bilgeadam.commentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class CommentAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommentAppApplication.class, args);
    }

}
