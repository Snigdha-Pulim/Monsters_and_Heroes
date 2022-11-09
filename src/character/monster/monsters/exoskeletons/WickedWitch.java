package character.monster.monsters.exoskeletons;

import character.monster.Monster;
import character.monster.favoredAttribute.Exoskeletons;

public class WickedWitch extends Monster {
    public WickedWitch() {
        super(2);
        name = "WickedWitch";
        base_damage = 250;
        defense = 350;
        dodge = 25;
        favoredAttribute = new Exoskeletons(this);
    }
}
