package spell.spells.iceSpells;

import spell.Spell;
import spell.behaviour.IceSpell;

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
