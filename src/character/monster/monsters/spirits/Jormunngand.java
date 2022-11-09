package character.monster.monsters.spirits;

import character.monster.Monster;
import character.monster.favoredAttribute.Spirits;

public class Jormunngand extends Monster {
    public Jormunngand(int level) {
        super(8);
        name = "Jormunngand";
        base_damage = 600;
        defense = 900;
        dodge = 20;
        favoredAttribute = new Spirits(this);
    }
}
