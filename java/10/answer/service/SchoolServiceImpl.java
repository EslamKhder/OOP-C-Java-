package com.java.service;

import com.java.model.Student;

public abstract class SchoolServiceImpl implements SchoolService{
    @Override
    public Student saveStudent(Student student) {
        return student;
    }

    @Override
    public void showStudent(Student student) {
        System.out.println(student.getId() + "   " + student.getName());
    }
}
