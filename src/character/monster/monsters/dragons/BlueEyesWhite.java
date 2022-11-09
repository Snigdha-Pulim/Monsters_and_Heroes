
package character.monster.monsters.dragons;

import character.monster.Monster;
import character.monster.favoredAttribute.Dragons;

public class BlueEyesWhite extends Monster {
    public BlueEyesWhite(int level) {
        super(9);
        name = "BlueEyesWhite";
        base_damage = 900;
        defense = 600;
        dodge = 75;
        favoredAttribute = new Dragons(this);
    }
}
