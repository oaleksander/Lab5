package com.company.commands;

import com.company.collectionmanagement.DragonHolder;
import com.company.ui.CommandExecutor;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;

public class Info implements Command{
    public String getLabel() {
        return "info";
    }

    public String getDescription() {
        return "Gives the info about collection.";
    }

    public String execute(String argument) {
        return "Dragon collection, initialization date: " + DragonHolder.getInitializationDate()+ ", number of elements: " + DragonHolder.getCollection().size() + ".";
    }
}
