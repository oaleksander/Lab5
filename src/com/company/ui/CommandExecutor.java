package com.company.ui;

import com.company.commands.*;

public class CommandExecutor {
    public static final Command[] AvailableCommands = {new Help(), new Exit(), new Info(), new Clear(), new Show(), new UpdateID(), new Insert(), new RemoveKey()};

    public static void Execute(UserCommand userCommand) {
        boolean commandIsFound = false;
        String response = "Command gave no response.";
        try {
            for (Command command : AvailableCommands) {
                if (userCommand.Command.equals(command.getLabel()) && !commandIsFound) {
                    commandIsFound = true;
                    response = command.execute(userCommand.Argument);
                }
            }
            if (!commandIsFound)
                response = "Unknown command \"" + userCommand.Command + "\". try \"help\" for list of commands";
        } catch (IllegalArgumentException e) {
            response = e.getMessage();
        } catch (Exception e) {
            response = "Unexpected error: " + e.getMessage() + ". This is a bug!";
        }
        System.out.println(response);
    }
}

