package com.company.actions;

public class Add implements Action {
    public String getLabel() {
        return "add";
    }

    public String getExpectedArguments() {
        return "{element}";
    }

    public String getDescription() {
        return "Add new element to collection";
    }

    public void execute() {
    }
}
