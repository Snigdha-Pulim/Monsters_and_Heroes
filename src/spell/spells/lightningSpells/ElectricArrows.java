package spell.spells.lightningSpells;

import spell.Spell;
import spell.behaviour.LightningSpell;

public class ElectricArrows extends Spell {
    public ElectricArrows(){
        spellBehaviour=new LightningSpell(this);
        name="Electric_Arrows";
        cost=550;
        required_level=5;
        damage=650;
        mana_cost=200;
    }
}
