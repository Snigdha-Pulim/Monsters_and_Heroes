package character.monster.monsters.spirits;

import character.monster.Monster;
import character.monster.favoredAttribute.Spirits;

public class Casper extends Monster {
    public Casper() {
        super(1);
        name = "Casper";
        base_damage = 100;
        defense = 100;
        dodge = 50;
        favoredAttribute = new Spirits(this);
    }
}
