package character.monster.monsters.spirits;

import character.monster.Monster;
import character.monster.favoredAttribute.Spirits;

public class ChiangShih extends Monster {
    public ChiangShih() {
        super(4);
        name = "Chiang-shih";
        base_damage = 700;
        defense = 600;
        dodge = 40;
        favoredAttribute = new Spirits(this);
    }
}
