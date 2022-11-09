package character.monster.monsters.spirits;

import character.monster.Monster;
import character.monster.favoredAttribute.Spirits;

public class Blinky extends Monster {
    public Blinky() {
        super(1);
        name = "Blinky";
        base_damage = 450;
        defense = 350;
        dodge = 35;
        favoredAttribute = new Spirits(this);
    }
}
