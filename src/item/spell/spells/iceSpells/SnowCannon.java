package item.spell.spells.iceSpells;

import item.spell.behaviour.IceSpell;
import item.spell.Spell;

public class SnowCannon extends Spell {
    public SnowCannon(){
        spellBehaviour=new IceSpell(this);
        name="Snow_Cannon";
        cost=500;
        required_level=2;
        damage=650;
        mana_cost=250;
    }
}
