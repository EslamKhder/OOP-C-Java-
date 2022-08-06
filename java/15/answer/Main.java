package com.java;

import com.java.model.Course;
import com.java.model.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("student 1");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("student 2");

        Course course1 = new Course();
        course1.setId(1);
        course1.setName("course 1");

        Course course2 = new Course();
        course2.setId(2);
        course2.setName("course 2");

        student1.getCourses().add(course1);
        student1.getCourses().add(course2);

        student2.getCourses().add(course2);

        course1.getStudents().add(student1);

        course2.getStudents().add(student1);
        course2.getStudents().add(student2);

        System.out.println(student1.getCourses().size()); // 2
        System.out.println(student1.getCourses().get(0).getName()); // 2

        System.out.println(student2.getCourses().size()); // 1
        System.out.println(course1.getStudents().size()); // 1
        System.out.println(course2.getStudents().size());// 2
        System.out.println(course2.getStudents().get(1).getName());// 2     0 1
    }
}