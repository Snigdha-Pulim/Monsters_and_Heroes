package character.monster.monsters.exoskeletons;

import character.monster.Monster;
import character.monster.favoredAttribute.Exoskeletons;

public class StYeenoghu extends Monster {
    public StYeenoghu() {
        super(9);
        name = "St-Yeenoghu";
        base_damage = 950;
        defense = 850;
        dodge = 90;
        favoredAttribute = new Exoskeletons(this);
    }
}
