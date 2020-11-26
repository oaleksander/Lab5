package com.company.ui;

public class UserCommand {
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
