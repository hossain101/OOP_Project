package com.company;

import java.util.*;

// The scanner class used for input is "input"

public class Hospital {

    Scanner input = new Scanner(System.in);

    String hospitalName;
    ArrayList<HospitalStaff> staff = new ArrayList<HospitalStaff>();

    HospitalStaff staffType = new HospitalStaff() {};

    Hospital () {
    }

    Hospital ( HospitalStaff staffType ) {

        staff.add(new Manager("Shoaib Hossain", 619));
        staff.add(new Manager("Samiya Hussain Samantha", 555));
        staff.add(new Nurse("Suzana Maria", 546));
        staff.add(new Nurse("Tasnim Sania", 493));
        staff.add(new Nurse("Sokina Aktar", 889));
        staff.add(new Nurse("Sakib Khan", 869));
        this.staffType = staffType;


    }

    void identification(Object staffType){

        int index = staff.indexOf(((Manager)staffType).getId());

        if (staffType instanceof Manager){
            



        }

    }



    void displayLog () {
        System.out.println("Mask Box left in inventory : " + staffType.totalMaskBox);


    }

    public void displayMenu ( Object staffType ) {

        int choice = 0;
        if (staffType instanceof Manager) {

            identification();

            do {
                System.out.println("1) Add Mask Box ");
                System.out.println("2) Display Remaining Mask Box ");
                System.out.println("3) See Mask Log ");
                System.out.println("4) Exit ");
                System.out.print("Choice : ");
                choice = input.nextInt();

                switch (choice) {


                    case 1:

                        //We shall be adding mask box to inventory from the manager class.
                        System.out.print("Enter Number of Mask Box to add in the Inventory : ");
                        int numOfBox = input.nextInt();
                        ((Manager) staffType).addMaskBox(numOfBox);
                        break;
                    case 3:
                        System.out.println("############# Mask Log #############");
                        displayLog();


                }


            } while (choice != 4);


        } else if (staffType instanceof Nurse) {

            do {
                System.out.println("1) Take A number of Mask Box ");

                System.out.println("3) Exit");
                System.out.print("Choice : ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        //Here we add the number of mask box the nurse wants to take.
                        System.out.print("Enter Number of Mask Box to take from the Inventory : ");
                        int numOfBox = input.nextInt();
                        ((Nurse) staffType).takeMaskBox(numOfBox);
                }

            } while (choice != 3);
        }


    }


}
