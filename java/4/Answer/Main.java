package com.java;


import java.util.Scanner;

import com.java.model.Player;
import com.java.model.Student;
import com.java.service.PlayerService;
import com.java.service.PlayerServiceImpl;
import com.java.service.StudentService;
import com.java.service.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        player.setId(scanner.nextInt());
        player.setName(scanner.next());
        player.setNumber(scanner.nextInt());
        Student student = new Student();
        student.setId(scanner.nextInt());
        student.setName(scanner.next());
        student.setAge(scanner.nextInt());

        PlayerService playerServiceImpl = new PlayerServiceImpl();
        playerServiceImpl.print(player);

        StudentService studentServiceImpl = new StudentServiceImpl();
        studentServiceImpl.print(student);
    }
}
