package com.java.validate;

import com.java.model.Player;
import com.java.model.Student;

public class ValidationService {

    public static boolean validatePlayer(Player player){
        if(player.getId() > 0 && player.getNumber() > 0 && player.getNumber() <= 99){
            return true;
        }
        return false;
    }

    public static boolean validateStudent(Student student){
        if(student.getId() > 0 && student.getAge() > 7 && student.getAge() <= 30){
            return true;
        }
        return false;
    }
}
