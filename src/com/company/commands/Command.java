package com.company.commands;

public interface Command {
    String getLabel();

    default String getArgumentLabel() {
        return "";
    }

    String getDescription();

    String execute(String argument);

    default String execute() {return execute("");}

}
