package com.java.service;

import com.java.model.Student;

public class PublicSchooltServiceImpl implements SchoolService {
    @Override
    public void print(Student student) {
        System.out.println("Public");
        System.out.println(student.getId() + " - " + student.getName());
    }
}
