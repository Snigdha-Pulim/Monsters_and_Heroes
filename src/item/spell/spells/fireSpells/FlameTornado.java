package item.spell.spells.fireSpells;

import item.spell.Spell;
import item.spell.behaviour.FireSpell;

public class FlameTornado extends Spell {
    public FlameTornado(){
        spellBehaviour=new FireSpell(this);
        name="Flame_Tornado";
        cost=700;
        required_level=4;
        damage=850;
        mana_cost=300;
    }
}
