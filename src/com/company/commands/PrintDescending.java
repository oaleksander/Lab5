package com.company.commands;

import com.company.collectionmanagement.DragonHolder;
import com.company.storables.Dragon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDescending implements Command {
    public String getLabel() {
        return "print_descending";
    }

    public String getDescription() {
        return "Show all collection elements sorted by age.";
    }

    String response;

    public String execute(String argument) {
        response = "Sorted collection:\n";
        DragonHolder.getCollection().values().stream().sorted(Comparator.comparingLong(Dragon::getAge).reversed())
                .forEachOrdered(element -> response += element.toString() + "\n");
        return response;
    }
}
