package com.company.actions;

public class Add_if_max implements Action {
    public String getLabel() {
        return "add_if_max";
    }

    public String getExpectedArguments() {
        return "{element}";
    }

    public String getDescription() {
        return "Add new element to collection if its value exceeds the highest value of current collection";
    }

    public void execute() {
    }
}
