package character.monster.monsters.exoskeletons;

import character.monster.Monster;
import character.monster.favoredAttribute.Exoskeletons;

public class Chronepsish extends Monster {
    public Chronepsish(int level) {
        super(6);
        name = "Chronepsish";
        base_damage = 650;
        defense = 750;
        dodge = 60;
        favoredAttribute = new Exoskeletons(this);
    }
}
