package com.company.actions;

public class Exit implements Action {

    public String getLabel() {
        return "exit";
    }

    public String getDescription() {
        return "Exits the program.";
    }

    public void execute() {
        System.out.println("Exiting...");
        System.exit(0);
    }
}
