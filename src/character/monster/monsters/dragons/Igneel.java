
package character.monster.monsters.dragons;

import character.monster.Monster;
import character.monster.favoredAttribute.Dragons;

public class Igneel extends Monster {
    public Igneel() {
        super(6);
        name = "Igneel";
        base_damage = 600;
        defense = 400;
        dodge = 60;
        favoredAttribute = new Dragons(this);
    }
}
