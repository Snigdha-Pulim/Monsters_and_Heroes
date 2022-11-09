package character.monster.monsters.dragons;

import character.monster.Monster;
import character.monster.favoredAttribute.Dragons;

public class DMaleficent extends Monster {
    public DMaleficent(int level) {
        super(9);
        name = "D-Maleficent";
        base_damage = 900;
        defense = 950;
        dodge = 85;
        favoredAttribute = new Dragons(this);
    }
}
