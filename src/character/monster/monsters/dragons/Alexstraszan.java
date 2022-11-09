package character.monster.monsters.dragons;

import character.monster.Monster;
import character.monster.favoredAttribute.Dragons;

public class Alexstraszan extends Monster {
    public Alexstraszan(int level) {
        super(10);
        name = "Alexstraszan";
        base_damage = 1000;
        defense = 9000;
        dodge = 55;
        favoredAttribute = new Dragons(this);
    }
}
