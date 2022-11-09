package character.monster.monsters.exoskeletons;

import character.monster.Monster;
import character.monster.favoredAttribute.Exoskeletons;

public class Brandobaris extends Monster {
    public Brandobaris() {
        super(3);
        name = "Brandobaris";
        base_damage = 350;
        defense = 450;
        dodge = 30;
        favoredAttribute = new Exoskeletons(this);
    }
}
