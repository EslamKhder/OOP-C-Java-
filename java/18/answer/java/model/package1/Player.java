package com.java.model.package1;

import com.java.model.package2.CaptainBenefit;

//public class Player extends PlayerBenefit {
public class Player extends CaptainBenefit {

    public int id;
    public String name;
    public int number;

    /*public void call(){
        super.id = 1;
        super.benefitPlayer = "benefitPlayer";
        super.allBenefitPlayer = "allBenefitPlayer";
    }*/

    public void call(){
        super.id = 1;
        super.benefitCaptain = "benefitCaptain";
        //super.allBenefitCaptain = "allBenefitCaptain";
    }
}
