package com.company.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandReader {

    BufferedReader bufferedReader;

    public CommandReader(BufferedReader _bufferedReader) {
        bufferedReader = _bufferedReader;
    }

    public String getStringFromBufferedReader() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage() + ".");
            return "";
        }
    }

    public static String[] getStringsFromTerminal(){
        return new CommandReader(new BufferedReader(new InputStreamReader(System.in))).getStringFromBufferedReader().split(" ");
    }

    public static String getStringFromTerminal(){
        return new CommandReader(new BufferedReader(new InputStreamReader(System.in))).getStringFromBufferedReader();
    }

    public UserCommand readCommandFromBufferedReader() {
            return readCommandFromString(getStringFromBufferedReader());
    }

    public static UserCommand readCommandFromString(String singleString) {
        return (readCommandFromString(singleString.split(" ", 2)));
    }

    public static UserCommand readCommandFromString(String[] input) {
        if (input.length != 0) {
            input[0] = input[0].toLowerCase();
            if (input.length > 1)
                return new UserCommand(input[0], input[1]);
            else
                return new UserCommand(input[0]);
        } else return new UserCommand();
    }

    public static class UserCommand {
        public String Command = null;
        public String Argument = null;

        public UserCommand(String Command, String Argument)
        {
            this.Command = Command;
            this.Argument = Argument;
        }

        public UserCommand(String Command)
        {
            this.Command = Command;
        }

        public UserCommand() {}

        @Override
        public String toString() {
            return "Command{" +
                    "Command='" + Command + '\'' +
                    ", Arguments='" + Argument + '\'' +
                    '}';
        }
    }
}
