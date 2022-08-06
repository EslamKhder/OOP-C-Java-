package com.java.service;

import com.java.model.Student;

public class SchoolServiceImpl1 extends SchoolServiceImpl{

    @Override
    public Student saveStudent(Student student) {
        System.out.println("save student");
        return student;
    }
}
