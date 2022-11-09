package character.monster.monsters.exoskeletons;

import character.monster.Monster;
import character.monster.favoredAttribute.Exoskeletons;

public class Exodia extends Monster {
    public Exodia(int level) {
        super(10);
        name = "Exodia";
        base_damage = 1000;
        defense = 1000;
        dodge = 50;
        favoredAttribute = new Exoskeletons(this);
    }
}
