package character.monster.monsters.exoskeletons;

import character.monster.Monster;
import character.monster.favoredAttribute.Exoskeletons;

public class StShargaas extends Monster {
    public StShargaas() {
        super(5);
        name = "St-Shargaas";
        base_damage = 550;
        defense = 650;
        dodge = 55;
        favoredAttribute = new Exoskeletons(this);
    }
}
