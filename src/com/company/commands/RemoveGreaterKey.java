package com.company.commands;

import com.company.collectionmanagement.DragonHolder;

import java.util.LinkedList;

public class RemoveGreaterKey implements Command {
    @Override
    public String getLabel() {
        return "remove_greater_key";
    }

    @Override
    public String getArgumentLabel() {
        return "{key}";
    }

    @Override
    public String getDescription() {
        return "Removes elements from collection with keys larger than {key}";
    }

    @Override
    public String execute(String argument) {
        int keyThreshold;
        if (argument == null || argument.isEmpty())
            throw new IllegalArgumentException("Please specify Dragon key.");
        try {
            keyThreshold = Integer.parseInt(argument);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Illegal key: " + e.getMessage() + ".");
        }
        LinkedList<Integer> toRemove = new LinkedList<>();
        DragonHolder.getCollection().forEach((key, dragon) -> {
            if (key > keyThreshold) toRemove.add(key);
        });
        toRemove.forEach(key -> DragonHolder.getCollection().remove(key));
        return "Removed " + toRemove.size() + " Dragons.";
    }
}
