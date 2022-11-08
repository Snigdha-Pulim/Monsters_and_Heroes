package spell;

import character.Monster;
import spell.behaviour.SpellBehaviour;

public class Spell {
    protected String name;
    protected int required_level;
    protected int damage;
    protected int mana_cost;
    protected int cost;
    protected SpellBehaviour spellBehaviour;
    void use(Monster M){
        spellBehaviour.use(M);
    }
}
