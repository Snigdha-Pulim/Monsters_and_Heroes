package character.monster.monsters.dragons;

import character.monster.Monster;
import character.monster.favoredAttribute.Dragons;

public class Phaarthurnax extends Monster {
    public Phaarthurnax(int level) {
        super(6);
        name = "Phaarthurnax";
        base_damage = 600;
        defense = 700;
        dodge = 60;
        favoredAttribute = new Dragons(this);
    }
}
