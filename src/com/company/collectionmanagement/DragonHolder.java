package com.company.collectionmanagement;

import com.company.storables.Dragon;

import java.util.ArrayDeque;

public class DragonHolder {
    private static ArrayDeque<Dragon> collection = new ArrayDeque<Dragon>();
    public static void add(Dragon e)
    {
        collection.add(e);
    }
    public static void remove(Dragon e){
        collection.remove(e);
    }
    public static Dragon pollFirst(){
        return collection.pollFirst();
    }
}
