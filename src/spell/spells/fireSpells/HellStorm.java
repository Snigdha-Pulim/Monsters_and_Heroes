package spell.spells.fireSpells;

import spell.Spell;
import spell.behaviour.FireSpell;

public class HellStorm extends Spell {
    public HellStorm(){
        spellBehaviour=new FireSpell(this);
        name="Hell_Storm";
        cost=600;
        required_level=3;
        damage=950;
        mana_cost=600;
    }
}
