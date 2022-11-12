package item.spell.behaviour;

import character.hero.Hero;
import character.monster.Monster;
import item.spell.Spell;

//strategy pattern for different types of spells
public class IceSpell implements SpellBehaviour {
    Spell spell;

    public IceSpell(Spell spell) {
        this.spell = spell;
    }

    @Override
    public void use(Monster monster , Hero hero) {
        monster.base_damage=monster.base_damage*9/10;
    }

    @Override
    public String display() {
        return "Ice spell";
    }
}
