package com.java;


import java.util.Scanner;

import com.java.model.Student;
import com.java.service.PrivateSchoolServiceImpl;
import com.java.service.PublicSchooltServiceImpl;
import com.java.service.SchoolService;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.setId(scanner.nextInt());
        student.setName(scanner.next());

        SchoolService publicSchoolService = new PublicSchooltServiceImpl();
        publicSchoolService.print(student);

        SchoolService privateSchoolService = new PrivateSchoolServiceImpl();
        privateSchoolService.print(student);

    }
}
