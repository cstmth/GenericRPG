package de.carldressler.grl.items.gear;

import de.carldressler.grl.utils.enums.StatType;

public class SpellBook extends Gear {
    public SpellBook(String name, int value) {
        super(name, value, StatType.MAGIC);
    }
}
