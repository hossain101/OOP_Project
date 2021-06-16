package com.company;

public class Manager extends HospitalStaff implements MaskInventory {
    String name;
    int id;



    public Manager(){
        super();
    }
    public Manager(String name,int id){
        super(name,id);
    }

    void setName(String name){
        this.name=name;
    }
    void setId(int id){
        this.id=id;
    }

    String getName(){
        return name;
    }
    int getId(){
        return id;
    }





//only manager can add MaskBox
    public void addMaskBox (int addMaskBox) {
      super.totalMaskBox+=addMaskBox;
       System.out.println("Masks Added to Inventory Log.");

    }


//since the manager won't be taking out any mask this function is not applicable
    public void takeMaskBox (int unimportant) {}

    //since the manager won't be taking out any mask this function is not applicable

    public void takeMask () {

    }

    public double calcRemainingMask (){

        return super.totalMaskBox;
    };
    public double calcRemainingMaskBox (){
        return super.totalMaskBox;
    };

}
