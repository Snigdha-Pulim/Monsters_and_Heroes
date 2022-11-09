package character.monster.monsters.spirits;

import character.monster.Monster;
import character.monster.favoredAttribute.Spirits;

public class Melchiresas extends Monster {
    public Melchiresas() {
        super(7);
        name = "Melchiresas";
        base_damage = 350;
        defense = 150;
        dodge = 75;
        favoredAttribute = new Spirits(this);
    }
}
