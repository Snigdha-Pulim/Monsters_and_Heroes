package item.spell.spells.iceSpells;

import item.spell.behaviour.IceSpell;
import item.spell.Spell;

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
