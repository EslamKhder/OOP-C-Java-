package com.java.validate;

import com.java.model.Data;

public class DataValidationImpl {


    public static boolean validateEvenNumber(Data data){
        if(data.getNum1() % 2 == 0 && data.getNum2() % 2 == 0 && data.getNum3() % 2 == 0){
            return true;
        }
        return false;
    }
}
