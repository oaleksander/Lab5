package com.company.commands;

import com.company.collectionmanagement.DragonHolder;

import java.util.Arrays;

public class Show implements Command{
    public String getLabel() {
        return "show";
    }

    public String getDescription() {
        return "Show all collection elements.";
    }

    String response;
    public String execute(String argument) {
        response = "Collection:\n";
        Arrays.stream(DragonHolder.getCollection().values().toArray()).forEach(element -> response += element.toString() + "\n");
        return response;
    }
}
