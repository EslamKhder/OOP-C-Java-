package com.java.service;

import com.java.model.Post;

public class FacebookServiceImpl implements StanderService{
    @Override
    public Post savePost(Post post) {
        System.out.println("inside Facebook");
        return post;
    }
}
