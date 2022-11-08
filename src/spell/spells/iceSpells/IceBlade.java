package spell.spells.iceSpells;

import spell.Spell;
import spell.behaviour.IceSpell;

public class IceBlade extends Spell {
    public IceBlade(){
        spellBehaviour=new IceSpell(this);
        name="Ice_Blade";
        cost=250;
        required_level=1;
        damage=450;
        mana_cost=100;
    }
}
