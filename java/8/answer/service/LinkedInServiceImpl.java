package com.java.service;

import com.java.model.Post;

public class LinkedInServiceImpl implements StanderService{
    @Override
    public Post savePost(Post post) {
        System.out.println("inside LinkedIn");
        return post;
    }
}
