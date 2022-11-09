package character.monster.monsters.spirits;

import character.monster.Monster;
import character.monster.favoredAttribute.Spirits;

public class Ereshkigall extends Monster {
    public Ereshkigall(int level) {
        super(6);
        name = "Ereshkigall";
        base_damage = 950;
        defense = 450;
        dodge = 35;
        favoredAttribute = new Spirits(this);
    }
}
