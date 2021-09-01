package de.carldressler.grl.entities.hero;

import de.carldressler.grl.items.CarryableItem;

public class Hero {
    // Stats
    public int health = 100;
    public int strength = 100;
    public int magic = 100;
    public double defence = 0.15;
    public double surprise = 0.5;

    // Inventory
    CarryableItem[] items = new CarryableItem[10];

    public void getStatsReport() {

    }
}
