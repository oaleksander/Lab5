package com.company.actions;

public class Add_if_min implements Action {
    public String getLabel() {
        return "add_if_min";
    }

    public String getExpectedArguments() {
        return "{element}";
    }

    public String getDescription() {
        return "Add new element to collection if its value is lower than the lowest value of current collection";
    }

    public void execute() {
    }
}
