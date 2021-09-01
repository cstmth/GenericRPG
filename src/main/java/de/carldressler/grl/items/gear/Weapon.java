package de.carldressler.grl.items.gear;

import de.carldressler.grl.utils.enums.StatType;

public class Weapon extends Gear {
    public Weapon(String name, int value) {
        super(name, value, StatType.STRENGTH);
    }
}
