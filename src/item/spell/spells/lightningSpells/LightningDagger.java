package item.spell.spells.lightningSpells;

import item.spell.Spell;
import item.spell.behaviour.LightningSpell;

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
