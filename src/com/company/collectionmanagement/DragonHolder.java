package com.company.collectionmanagement;

import com.company.storables.Dragon;

import java.util.*;

public class DragonHolder {
    private static final Object lock  = new Object();

    private static final Date initializationDate = new Date();

    private static final Hashtable<Integer,Dragon> collection = new Hashtable<>();

    synchronized public static Hashtable<Integer, Dragon> getCollection() {
        return collection;
    }

    public static Date getInitializationDate() {
        return initializationDate;
    }
}
