package character.monster.monsters.exoskeletons;

import character.monster.Monster;
import character.monster.favoredAttribute.Exoskeletons;

public class Aasterinian extends Monster {
    public Aasterinian() {
        super(4);
        name = "Aasterinian";
        base_damage = 400;
        defense = 500;
        dodge = 45;
        favoredAttribute = new Exoskeletons(this);
    }
}
