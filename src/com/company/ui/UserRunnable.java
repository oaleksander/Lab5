package com.company.ui;

import com.company.commands.*;

import java.io.*;

public class UserRunnable implements Runnable{

    private static File file = new File("C:\\Users\\muram\\IdeaProjects\\Lab5\\file.csv");

    private final PrintStream printStream;

    private final CommandReader commandReader;

    public UserRunnable(Command[] availableCommands, PrintStream printStream, InputStream inputStream) {
        this.availableCommands = availableCommands;
        this.printStream = printStream;
        this.commandReader = new CommandReader(new BufferedReader(new InputStreamReader(inputStream)));
    }

    public static File getFile() {
        return file;
    }

    public static void setFile(String fileName) {
        file = new File(fileName);
    }

    public static final Command[] allCommands = {
            new Help(),
            new Info(),
            new Show(),
            new Insert(),
            new UpdateID(),
            new RemoveKey(),
            new Clear(),
            new Save(),
            new Execute_script(),
            new Exit(),
            new ReplaceIfGreaterAge(),
            new RemoveGreaterKey(),
            new RemoveLowerKey(),
            new RemoveAllAge(),
            new FilterLessThanType(),
            new PrintDescending(),
            new Read(),
            new CsvInsert(),
            new CsvUpdateID(),
            new CsvReplaceIfGreaterAge()
    };
    public static final Command[] userCommands = {
            new Help(),
            new Info(),
            new Show(),
            new Insert(),
            new UpdateID(),
            new RemoveKey(),
            new Clear(),
            new Save(),
            //new Execute_script(),
            //new Exit(),
            new ReplaceIfGreaterAge(),
            new RemoveGreaterKey(),
            new RemoveLowerKey(),
            new RemoveAllAge(),
            new FilterLessThanType(),
            new PrintDescending(),
            //new Read(),
            //new CsvInsert(),
            //new CsvUpdateID(),
            //new CsvReplaceIfGreaterAge()
    };
    public static final Command[] scriptCommands = {
            new Help(),
            new Info(),
            new Show(),
            //new Insert(),
            //new UpdateID(),
            new RemoveKey(),
            new Clear(),
            new Save(),
            //new Execute_script(),
            //new Exit(),
            //new ReplaceIfGreaterAge(),
            new RemoveGreaterKey(),
            new RemoveLowerKey(),
            new RemoveAllAge(),
            new FilterLessThanType(),
            new PrintDescending(),
            //new Read(),
            new CsvInsert(),
            new CsvUpdateID(),
            new CsvReplaceIfGreaterAge()
    };

    private final Command[] availableCommands;

    public void Execute(CommandReader.UserCommand userCommand) {
        boolean commandIsFound = false;
        String response = "Command gave no response.";
        try {
            for (Command command : availableCommands) {
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
            e.printStackTrace();
        }
        printStream.println(response);
    }

    @Override
    public void run() {
        //noinspection InfiniteLoopStatement
        for(;;) {
            Execute(commandReader.readCommandFromBufferedReader());
        }
    }
}

