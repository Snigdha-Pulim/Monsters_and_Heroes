package spell.spells.fireSpells;

import spell.Spell;
import spell.behaviour.FireSpell;

public class HeatWave extends Spell {
    public HeatWave(){
        spellBehaviour=new FireSpell(this);
        name="Heat_Wave";
        cost=450;
        required_level=2;
        damage=600;
        mana_cost=150;
    }
}
