package com.company;

import com.company.storables.Coordinates;
import com.company.storables.Dragon;
import com.company.storables.DragonHead;
import com.company.storables.DragonType;
import com.company.ui.CommandExecutor;
import com.company.ui.CommandReader;

import javax.xml.bind.*;
import java.io.*;
import java.util.Date;

public class Main {

    public static void main(String[] args){
        //DragonHolder.getCollection().put("key?",dragon);

        System.out.println("Welcome to interactive Dragon Hashtable manager. To get help, enter \"help\".");
        //noinspection InfiniteLoopStatement
        for (;;) {
            CommandExecutor.Execute(CommandReader.readCommandFromTerminal());
        }
    }
}
