package item.spell.spells.iceSpells;

import item.spell.Spell;
import item.spell.behaviour.IceSpell;

public class FrostBlizzard extends Spell {
    public FrostBlizzard(){
        spellBehaviour=new IceSpell(this);
        name="Frost_Blizzard";
        cost=750;
        required_level=5;
        damage=850;
        mana_cost=350;
    }
}
