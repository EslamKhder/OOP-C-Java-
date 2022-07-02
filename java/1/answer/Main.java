package com.java;


import java.util.Scanner;

import com.java.model.Student;
import com.java.service.StudentService;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.setId(scanner.nextInt());
        student.setName(scanner.next());
        student.setAge(scanner.nextInt());
        StudentService studentService = new StudentService();
        studentService.print(student);
    }
}
