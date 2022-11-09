package character.monster.monsters.dragons;

import character.monster.Monster;
import character.monster.favoredAttribute.Dragons;

public class KasEthelinh extends Monster {
    public KasEthelinh(int level) {
        super(5);
        name = "Kas-Ethelinh";
        base_damage = 600;
        defense = 500;
        dodge = 60;
        favoredAttribute = new Dragons(this);
    }
}
