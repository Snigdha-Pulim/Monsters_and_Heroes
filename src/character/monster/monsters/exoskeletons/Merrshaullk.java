package character.monster.monsters.exoskeletons;

import character.monster.Monster;
import character.monster.favoredAttribute.Exoskeletons;

public class Merrshaullk extends Monster {
    public Merrshaullk(int level) {
        super(10);
        name = "Merrshaullk";
        base_damage = 1000;
        defense = 900;
        dodge = 55;
        favoredAttribute = new Exoskeletons(this);
    }
}
