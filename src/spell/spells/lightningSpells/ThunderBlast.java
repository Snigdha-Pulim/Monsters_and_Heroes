package spell.spells.lightningSpells;

import spell.Spell;
import spell.behaviour.LightningSpell;

public class ThunderBlast extends Spell {
    public ThunderBlast(){
        spellBehaviour=new LightningSpell(this);
        name="Thunder_Blast";
        cost=750;
        required_level=4;
        damage=950;
        mana_cost=400;
    }
}
