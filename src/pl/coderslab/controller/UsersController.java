package pl.coderslab.controller;

import java.util.Scanner;

public class UsersController {
    public static void startManagingUsers(){
        int action = choseAction();
        switch (action){
            case 1:
        }
    }
    public static void addUser(){
        System.out.println("Add user");
        // connect to db
        // create User get info from scanner
        // end of
    }
    public static void changeUsers(){
        System.out.println("edit user");
        // connect to db (dao)
        // get user entity + dao Select
        //set user entity + from dao Select
        // end of

    }
    private static int choseAction(){

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("What you want to do with Users Groups:");
            System.out.println("1 - Add");
            System.out.println("2 - Edit");
            System.out.println("3 - Delete");
            System.out.println("4 - List all");
            System.out.println("0 - Main menu");

            try{
                int option = scan.nextInt();
                if(option < 0 || option > 4){
                    throw new Exception("Wrong value");
                }
                return option;
            }catch (Exception e){
                System.out.println("Wrong value");
                scan.next();
            }

        }

    }



}
