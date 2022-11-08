package spell.spells.lightningSpells;

import spell.Spell;
import spell.behaviour.LightningSpell;

public class LightningDagger extends Spell {
    public LightningDagger(){
        spellBehaviour=new LightningSpell(this);
        name="Lightning_Dagger";
        cost=400;
        required_level=1;
        damage=500;
        mana_cost=150;
    }
}
