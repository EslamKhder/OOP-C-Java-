package com.java;

import com.java.model.Student;
import com.java.service.SchoolService;
import com.java.service.SchoolServiceImpl;
import com.java.service.SchoolServiceImpl1;
import com.java.service.SchoolServiceImpl2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("student 1");

        SchoolService schoolService = new SchoolServiceImpl1();
        System.out.println(schoolService.saveStudent(student).getName());
        schoolService.showStudent(student);

        System.out.println("--------------");
        SchoolService schoolService2 = new SchoolServiceImpl2();
        System.out.println(schoolService2.saveStudent(student).getName());
        schoolService2.showStudent(student);
    }

}