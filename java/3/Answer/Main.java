package com.java;


import java.util.Scanner;

import com.java.model.Data;
import com.java.service.ProcessServiceImpl;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Data data = new Data();
        data.setNum1(scanner.nextInt());
        data.setNum2(scanner.nextInt());
        data.setNum3(scanner.nextInt());
        ProcessServiceImpl processServiceImpl = new ProcessServiceImpl();
        System.out.println(processServiceImpl.sum(data));

    }
}
