package com.java.service;

import com.java.model.Data;
import com.java.validate.DataValidationImpl;

public class ProcessServiceImpl implements ProcessService {

    @Override
    public int sum(Data data){
        if(DataValidationImpl.validateEvenNumber(data)){
            return data.getNum1() + data.getNum2() + data.getNum3();
        }
        return -1;
    }
}
