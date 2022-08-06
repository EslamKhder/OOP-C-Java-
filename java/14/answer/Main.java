package com.java;

import com.java.model.Email;
import com.java.model.Student;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setName("student");

        Email email1 = new Email();
        email1.setId(1);
        email1.setEmail("eslam1@gmail.com");
        email1.setNumber("01113903660");

        Email email2 = new Email();
        email2.setId(2);
        email2.setEmail("eslam2@gmail.com");
        email2.setNumber("01265598654");

        student.getEmails().add(email1);
        student.getEmails().add(email2);

        email1.setStudent(student);
        email2.setStudent(student);

        System.out.println(email1.getStudent().getName());
        System.out.println(email2.getStudent().getName());

        System.out.println(student.getEmails().get(0).getEmail());
        System.out.println(student.getEmails().get(1).getEmail());



    }
}