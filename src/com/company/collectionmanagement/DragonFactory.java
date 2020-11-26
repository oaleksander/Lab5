package com.company.collectionmanagement;

import com.company.storables.Dragon;

import java.util.ArrayList;

public class DragonFactory {
    static ArrayList<Integer> usedIDs;
    static void assignID(Dragon e)
    {
        int newID = 1;
        while(usedIDs.contains(newID)) newID++;
        e.setId(newID);
    }
}
