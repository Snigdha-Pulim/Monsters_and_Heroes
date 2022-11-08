package item.spell.spells.lightningSpells;

import item.spell.behaviour.LightningSpell;
import item.spell.Spell;

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
