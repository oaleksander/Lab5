package com.company.xml;

import com.company.storables.Dragon;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class DragonContext {
    static JAXBContext jaxbContext;
    static {
        try {
            jaxbContext = JAXBContext.newInstance(Dragon.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
