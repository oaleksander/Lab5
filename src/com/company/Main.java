package com.company;

import com.company.commands.Read;
import com.company.ui.UserRunnable;

public class Main {

    public static void main(String[] args){
        UserRunnable userRunnable = new UserRunnable(UserRunnable.allCommands,System.out,System.in);

        System.out.println("Welcome to interactive Dragon Hashtable manager. To get help, enter \"help\".");
        if(args.length == 0)
            System.out.println("Input filename not specified by command line argument. Skipping...");
        else {
            try {
                UserRunnable.setFile(args[0]);
                try {
                    System.out.println(new Read().execute());
                } catch (Exception e) {
                    System.out.println(e.getMessage() + " Skipping...");
                }
            } catch (NullPointerException e) {
                System.out.println("Input filename is empty. Skipping...");
            }
        }

        userRunnable.run();
    }
}
