package character.monster.monsters.exoskeletons;

import character.monster.Monster;
import character.monster.favoredAttribute.Exoskeletons;

public class Cyrrollalee extends Monster {
    public Cyrrollalee() {
        super(7);
        name = "Cyrrollalee";
        base_damage = 700;
        defense = 800;
        dodge = 75;
        favoredAttribute = new Exoskeletons(this);
    }
}
