package de.carldressler.grl.items.gear;

import de.carldressler.grl.utils.enums.StatType;

public class Shoes extends Gear {
    public Shoes(String name, int value) {
        super(name, value, StatType.SURPRISE);
    }
}
