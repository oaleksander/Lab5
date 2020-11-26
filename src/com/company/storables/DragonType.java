package com.company.storables;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum(String.class)
public enum DragonType {
    @XmlEnumValue("WATER")
    WATER,

    @XmlEnumValue("UNDERGROUND")
    UNDERGROUND,

    @XmlEnumValue("AIR")
    AIR,

    @XmlEnumValue("FIRE")
    FIRE;
}
