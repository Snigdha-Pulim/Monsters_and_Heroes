package character.monster.monsters.dragons;

import character.monster.Monster;
import character.monster.favoredAttribute.Dragons;

public class Chrysophylax extends Monster {
    public Chrysophylax(int level) {
        super(2);
        name = "Chrysophylax";
        base_damage = 200;
        defense = 500;
        dodge = 20;
        favoredAttribute = new Dragons(this);
    }
}
