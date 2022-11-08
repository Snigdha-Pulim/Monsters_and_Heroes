package item.spell.spells.lightningSpells;

import item.spell.behaviour.LightningSpell;
import item.spell.Spell;

public class SparkNeedles extends Spell {
    public SparkNeedles(){
        spellBehaviour=new LightningSpell(this);
        name="Spark_Needles";
        cost=500;
        required_level=2;
        damage=600;
        mana_cost=200;
    }
}
