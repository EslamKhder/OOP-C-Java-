package com.java.service;

import com.java.model.Student;

public class StudentService {

    public void print(Student student){
        System.out.println(student.getId() + " - " + student.getName() + " - " + student.getAge());
    }
}
