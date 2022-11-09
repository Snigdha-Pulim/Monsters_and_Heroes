package character.monster.monsters.exoskeletons;

import character.monster.Monster;
import character.monster.favoredAttribute.Exoskeletons;

public class Kiaransalee extends Monster {
    public Kiaransalee() {
        super(8);
        name = "Kiaransalee";
        base_damage = 850;
        defense = 950;
        dodge = 85;
        favoredAttribute = new Exoskeletons(this);
    }
}
