package com.java.model.package2;


import com.java.model.package1.Student;

public class MainTeacher {
    public static void main(String[] args) {
        Student student = new Student();

        student.id = 1;
        student.name = "Ahmed";
        //student.garde = 10;

        Teacher teacher = new Teacher();
        teacher.id = 15;
        teacher.name = "Islam";
        teacher.active = 1;
    }
}