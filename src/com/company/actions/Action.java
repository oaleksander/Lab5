package com.company.actions;

public interface Action {
    String getLabel();

    default String getExpectedArguments() {
        return "";
    }

    String getDescription();

    default void execute(String argument) {
        execute();
    }

    void execute();

}
