package character.monster.monsters.exoskeletons;

import character.monster.Monster;
import character.monster.favoredAttribute.Exoskeletons;

public class BigBadWolf extends Monster {
    public BigBadWolf(int level) {
        super(1);
        name = "BigBad-Wolf";
        base_damage = 150;
        defense = 250;
        dodge = 15;
        favoredAttribute = new Exoskeletons(this);
    }
}
