package com.company.commands;

import com.company.ui.CommandExecutor;

import java.util.Arrays;

public class Help implements Command {
    public String getLabel() {
        return "help";
    }

    public String getDescription() {
        return "Gives the list of available commands.";
    }

    String response;
    public String execute(String argument) {
        response = "Available commands:\n";
        Arrays.stream(CommandExecutor.AvailableCommands).forEach(command -> response +=  command.getLabel() + " " + command.getArgumentLabel() + ": " + command.getDescription() + "\n");
        response += "Collection class members have to be entered line-by-line. Standard types (including primitive types) have to be entered in the same line as the command.";
        return response;
    }
}
