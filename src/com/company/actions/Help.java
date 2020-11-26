package com.company.actions;

import com.company.ui.CommandExecutor;

public class Help implements Action {
    public String getLabel() {
        return "help";
    }

    public String getDescription() {
        return "Gives the list of available commands.";
    }

    public void execute() {
        System.out.println("Available commands:");
        for (Action action : CommandExecutor.AvailableCommands) {
            System.out.println(action.getLabel() + " " + action.getExpectedArguments() + ": " + action.getDescription());
        }
        System.out.println("Collection class members have to be entered line-by-line in XML format. Standard datatypes (including primitive types) have to be entered in the same line as the command.");
    }
}
