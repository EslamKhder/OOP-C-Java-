package com.java.service;

import com.java.model.Student;

public class PrivateSchoolServiceImpl implements SchoolService {
    @Override
    public void print(Student student) {
        System.out.println("Private");
        System.out.println(student.getId() + " - " + student.getName());
    }
}
