package com.java;

import javafx.geometry.Pos;

import com.java.model.Post;
import com.java.service.FacebookService;
import com.java.service.FacebookServiceImpl;
import com.java.service.LinkedInService;
import com.java.service.LinkedInServiceImpl;
import com.java.service.StanderService;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.setId(1);
        post.setText("Post 1");
        post.setImage(null);
        StanderService facebookService = new FacebookServiceImpl();
        System.out.println(facebookService.savePost(post).getText());

        post.setId(2);
        post.setText("Post 2");
        post.setImage("Amazon Path");
        StanderService linkedInService = new LinkedInServiceImpl();
        System.out.println(linkedInService.savePost(post).getText());
    }

}