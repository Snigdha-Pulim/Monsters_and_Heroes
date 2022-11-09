package character.monster.monsters.dragons;

import character.monster.Monster;
import character.monster.favoredAttribute.Dragons;

public class TheWeatherbe extends Monster {
    public TheWeatherbe(int level) {
        super(8);
        name = "TheWeatherbe";
        base_damage = 800;
        defense = 900;
        dodge = 80;
        favoredAttribute = new Dragons(this);
    }
}
