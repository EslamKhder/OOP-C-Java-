package com.java.model.package2;

import com.java.model.package1.PlayerBenefit;

//public class Captain extends PlayerBenefit {
public class Captain extends CaptainBenefit {

    public int id;
    public String name;
    public int active;

   /* public void call(){
        super.id = 1;
        super.benefitPlayer = "benefitPlayer";
        //super.allBenefitPlayer = "allBenefitPlayer";
    }*/

    public void call(){
        super.id = 1;
        super.benefitCaptain = "benefitCaptain";
        super.allBenefitCaptain = "allBenefitCaptain";
    }

}
