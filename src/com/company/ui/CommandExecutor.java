package com.company.ui;

import com.company.actions.Action;
import com.company.actions.Exit;
import com.company.actions.Help;

public class CommandExecutor {
    public static Action[] AvailableCommands = {new Help(), new Exit()};

    public static void Execute(UserCommand userCommand) {
        boolean commandIsFound = false;
        for (Action action : AvailableCommands) {
            if (userCommand.Command.equals(action.getLabel()) && !commandIsFound) {
                commandIsFound = true;
                action.execute(userCommand.Argument);
            }
        }
        if (!commandIsFound)
            System.out.println("Unknown command " + '"' + userCommand.Command + '"' + '.');
    }
}

