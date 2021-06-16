package com.company;

public abstract class HospitalStaff {

    String name;
    int id;
    HospitalStaff(){
        name="";
        id=0;
    }
    HospitalStaff(String name,int id){
        this.name=name;
        this.id=id;
    }

    //Initialized mask box because there are masks present in the inventory

   protected int totalMaskBox=45;







}
