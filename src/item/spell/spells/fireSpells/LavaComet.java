package item.spell.spells.fireSpells;

import item.spell.Spell;
import item.spell.behaviour.FireSpell;

public class LavaComet extends Spell {
    public LavaComet(){
        spellBehaviour=new FireSpell(this);
        name="Lava_Comet";
        cost=800;
        required_level=7;
        damage=1000;
        mana_cost=550;
    }
}
