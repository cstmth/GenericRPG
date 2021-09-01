package de.carldressler.grl.items.potions;

import de.carldressler.grl.items.CarryableItem;
import de.carldressler.grl.utils.enums.StatType;

public class Potion extends CarryableItem {
    int value;
    StatType type;

    public Potion(String name, int value, StatType type) {
        super(name);
        this.value = value;
        this.type = type;
    }
}
