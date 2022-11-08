package item.spell.spells.iceSpells;

import item.spell.Spell;
import item.spell.behaviour.IceSpell;

public class ArcticStorm extends Spell {
    public ArcticStorm(){
        spellBehaviour=new IceSpell(this);
        name="Arctic_Storm";
        cost=700;
        required_level=6;
        damage=800;
        mana_cost=300;
    }
}
