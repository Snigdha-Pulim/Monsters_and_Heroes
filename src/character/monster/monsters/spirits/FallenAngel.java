package character.monster.monsters.spirits;

import character.monster.Monster;
import character.monster.favoredAttribute.Spirits;

public class FallenAngel extends Monster {
    public FallenAngel(int level) {
        super(5);
        name = "FallenAngel";
        base_damage = 800;
        defense = 700;
        dodge = 50;
        favoredAttribute = new Spirits(this);
    }
}
