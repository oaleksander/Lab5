package com.company;

import com.company.storables.Coordinates;
import com.company.storables.Dragon;
import com.company.storables.DragonHead;
import com.company.storables.DragonType;
import com.company.ui.CommandExecutor;
import com.company.ui.CommandReader;

import javax.naming.spi.ObjectFactory;
import javax.xml.bind.*;
import javax.xml.validation.Validator;
import java.io.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(com.company.storables.Dragon.class);
        Dragon dragon = new Dragon(1,"Петя", new Coordinates(3L,3), LocalDate.now(),3,"Хороший дракон", 3.1415f, DragonType.AIR, new DragonHead(999L));
       // Dragon dragon = new Dragon();
        dragon.setAge(3);
        Marshaller m = jaxbContext.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(dragon, System.out);
        Unmarshaller u = jaxbContext.createUnmarshaller();
        Dragon myDragon = (Dragon)u.unmarshal(new StringReader(
              "<dragon>\n" +
                "<id>0</id>\n" +
                "<age>3</age>\n" +
                "<type>DUNGEON</type>\n" +
                "<weight></weight>\n" +
               "</dragon>"));
        JAXB.marshal(myDragon, System.out);
        System.out.println(myDragon.getWeight());


        System.out.println("Welcome to interactive ArrayDeque<Dragon> manager. To get help, enter \"help\".");
        //noinspection InfiniteLoopStatement
        for (;;) {
            CommandExecutor.Execute(CommandReader.readCommand());
        }
    }
}
