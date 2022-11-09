package character.monster.monsters.spirits;

import character.monster.Monster;
import character.monster.favoredAttribute.Spirits;

public class Taltecuhtli extends Monster {
    public Taltecuhtli() {
        super(10);
        name = "Taltecuhtli";
        base_damage = 300;
        defense = 200;
        dodge = 50;
        favoredAttribute = new Spirits(this);
    }
}
