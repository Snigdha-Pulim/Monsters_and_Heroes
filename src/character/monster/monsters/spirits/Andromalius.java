package character.monster.monsters.spirits;

import character.monster.Monster;
import character.monster.favoredAttribute.Spirits;

public class Andromalius extends Monster {
    public Andromalius(int level) {
        super(3);
        name = "Andromalius";
        base_damage = 550;
        defense = 450;
        dodge = 25;
        favoredAttribute = new Spirits(this);
    }
}
