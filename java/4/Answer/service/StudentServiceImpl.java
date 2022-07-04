package com.java.service;

import com.java.model.Player;
import com.java.model.Student;
import com.java.validate.ValidationService;

public class StudentServiceImpl implements StudentService{

    @Override
    public void print(Student student){
        if(ValidationService.validateStudent(student)){
            System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
        } else {
            System.out.println("invalid data");
        }

    }
}
