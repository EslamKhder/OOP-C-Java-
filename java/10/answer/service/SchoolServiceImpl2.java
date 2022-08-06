package com.java.service;

import com.java.model.Student;

public class SchoolServiceImpl2 extends SchoolServiceImpl{
    @Override
    public void showStudent(Student student) {
        System.out.println("Inside show student");
        System.out.println(student.getId() + "   " + student.getName());
    }
}
