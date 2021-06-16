package com.company;

public class Nurse extends HospitalStaff implements MaskInventory {

    String name;
    int id;


    Room[] nurseRoom;
    int roomEntered;

    Nurse () {

        super();
    }

    Nurse ( String name, int id ) {

        super(name, id);
    }


    void setName ( String name ) {
        this.name = name;
    }

    void setId ( int id ) {
        this.id = id;
    }

    String getName () {
        return name;
    }

    int getId () {
        return id;
    }


    public void addMaskBox ( int unimportant ) {

    }
//The function to take mask box from the inventory
    public void takeMaskBox ( int takeMaskBox ) {
        if (takeMaskBox < 0) {
            System.out.println("Please enter a valid amount.");
        } else if ((totalMaskBox - takeMaskBox) < 0) {
            System.out.println("There is not enough Mask in the Inventory for this request.");
        } else {
            totalMaskBox -= takeMaskBox;
            System.out.println("\nRequest Logged Successfully");

        }
    }

    public void takeMask () {

    }

    void assignRoom ( Room _nurseRoom ) {
        nurseRoom[roomEntered] = _nurseRoom;
        roomEntered++;

    }

    public double calcRemainingMask () {
        return 0;
    }

    ;

    public double calcRemainingMaskBox () {
        return 0;
    }

    ;
}
