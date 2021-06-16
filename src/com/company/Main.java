package com.company;
import java.util.*;
//This is a mask inventory application for a Hospital
//This application Has a mask inventory
//New shipment of mask box can be added to the inventory
//Each room of in the hospital will be supplied with mask box
// Only hospital manager has access to mask inventory to add or remove mask.
//This application can keep track of how may mask has been required by each patient
//Each patient has a specific nurse attending them
//There will be a list of nurse with Id number assigned to each of them in the txt file and the application can access the txt file
//The application can assign nurse based on Id number



public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = 0;
        int managerId=0;
        int nurseId=0;



        do {

            System.out.println("\n *********** Hospital Mask Inventory ******* ");
            System.out.println();
            System.out.println(" 1. Hospital Manager");
            System.out.println(" 2. Hospital Nurse");
            System.out.println(" 3. Exit");

            System.out.println();
            System.out.print("Please enter your choice (1-3) :");
            choice = input.nextInt();






            switch(choice){
                case 1:
                    //manger id
                    //validate id from input.txt(so we need to make a vector/arraylist of managers)
                    //when authenticated, show manager menu

                    System.out.print("Please Enter Manager ID : ");
                    managerId=input.nextInt();
                    HospitalStaff staff = new Manager();
                   ((Manager) staff).setId(managerId);
                   Hospital hospitalStaff=new Hospital(staff);
                    //new Hospital(manager);

                    hospitalStaff.displayMenu(staff);

                    break;
                case 2:
                    //nurse id, validate, show nurse menu
                    System.out.print("Please Enter Nurse ID : ");
                    nurseId=input.nextInt();
                    HospitalStaff staff2 = new Nurse();
                    ((Nurse) staff2 ).setId(nurseId);
                    hospitalStaff=new Hospital(staff2);

                    break;

                case 3:
                    System.exit(0);
            }


        }while (choice!=3);


    }
}






























































