package character.monster.monsters.dragons;

import character.monster.Monster;
import character.monster.favoredAttribute.Dragons;

public class Natsunomeryu extends Monster {
    public Natsunomeryu() {
        super(1);
        name = "Natsunomeryu";
        base_damage = 100;
        defense = 200;
        dodge = 10;
        favoredAttribute = new Dragons(this);
    }
}
