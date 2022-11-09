package character.monster.monsters.spirits;

import character.monster.Monster;
import character.monster.favoredAttribute.Spirits;

public class Andrealphus extends Monster {
    public Andrealphus() {
        super(2);
        name = "Andrealphus";
        base_damage = 600;
        defense = 500;
        dodge = 40;
        favoredAttribute = new Spirits(this);
    }
}
