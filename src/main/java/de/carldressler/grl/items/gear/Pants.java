package de.carldressler.grl.items.gear;

import de.carldressler.grl.utils.enums.StatType;

public class Pants extends Gear {
    public Pants(String name, int value) {
        super(name, value, StatType.DEFENCE);
    }
}
