package com.company.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandReader {

    public static String getStringFromTerminal() {
        try {
            return new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage() + ".");
            return "";
        }
    }

    public static String[] getStringsFromTerminal(){
        return getStringFromTerminal().split(" ");
    }

    public static UserCommand readCommandFromTerminal() {
            return readCommandFromString(getStringFromTerminal());
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
}
