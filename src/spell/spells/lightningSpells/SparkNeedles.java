package spell.spells.lightningSpells;

import spell.Spell;
import spell.behaviour.LightningSpell;

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
