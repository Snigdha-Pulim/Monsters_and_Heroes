package character.monster.monsters.exoskeletons;

import character.monster.Monster;
import character.monster.favoredAttribute.Exoskeletons;

public class DocOck extends Monster {
    public DocOck(int level) {
        super(6);
        name = "DocOck";
        base_damage = 600;
        defense = 600;
        dodge = 55;
        favoredAttribute = new Exoskeletons(this);
    }
}
