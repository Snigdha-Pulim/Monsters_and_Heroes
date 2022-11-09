package character.monster.monsters.dragons;

import character.monster.Monster;
import character.monster.favoredAttribute.Dragons;

public class TheScaleless extends Monster {
    public TheScaleless(int level) {
        super(7);
        name = "TheScaleless";
        base_damage = 700;
        defense = 600;
        dodge = 75;
        favoredAttribute = new Dragons(this);
    }
}
