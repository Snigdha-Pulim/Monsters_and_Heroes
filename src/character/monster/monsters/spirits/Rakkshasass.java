package character.monster.monsters.spirits;

import character.monster.Monster;
import character.monster.favoredAttribute.Spirits;

public class Rakkshasass extends Monster {
    public Rakkshasass(int level) {
        super(9);
        name = "Rakkshasass";
        base_damage = 550;
        defense = 600;
        dodge = 35;
        favoredAttribute = new Spirits(this);
    }
}
