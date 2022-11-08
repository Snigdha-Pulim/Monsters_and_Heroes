package item.spell.spells.fireSpells;

import item.spell.Spell;
import item.spell.behaviour.FireSpell;

public class BreathOfFire extends Spell {
    public BreathOfFire(){
        spellBehaviour=new FireSpell(this);
        name="Breath_of_Fire";
        cost=350;
        required_level=1;
        damage=450;
        mana_cost=100;
    }
}
