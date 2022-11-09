package character.monster.monsters.dragons;

import character.monster.Monster;
import character.monster.favoredAttribute.Dragons;

public class BunsenBurner extends Monster {
    public BunsenBurner() {
        super(4);
        name = "BunsenBurner";
        base_damage = 400;
        defense = 500;
        dodge = 45;
        favoredAttribute = new Dragons(this);
    }
}
