package de.carldressler.grl;

import de.carldressler.grl.entities.hero.Hero;
import de.carldressler.grl.system.Output;

public class GenericRogueLike {
    public static Hero hero;

    public GenericRogueLike() {
        System.out.println("Result" + Output.askBoolean("Warum ist die Banane krumm?"));
    }
}
