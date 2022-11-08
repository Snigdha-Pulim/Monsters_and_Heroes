package item.spell;

import character.Monster;
import item.Item;
import item.spell.behaviour.SpellBehaviour;

public class Spell extends Item {
    protected int damage;
    protected int mana_cost;
    protected SpellBehaviour spellBehaviour;
    void use(Monster M){
        spellBehaviour.use(M);
    }
}
