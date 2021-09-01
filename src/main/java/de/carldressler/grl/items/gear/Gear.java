package de.carldressler.grl.items.gear;

import de.carldressler.grl.utils.enums.StatType;

public class Gear {
    String name;

    int value;
    StatType type;

    public Gear(String name, int value, StatType type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

}

