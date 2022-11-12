package item.spell.behaviour;

import character.hero.Hero;
import character.monster.Monster;
import item.spell.Spell;

//strategy pattern for different types of spells
public class LightningSpell implements SpellBehaviour{
    Spell spell;

    public LightningSpell(Spell spell) {
        this.spell = spell;
    }

    @Override
    public void use(Monster monster , Hero hero) {
        monster.dodge=monster.dodge*9/10;
    }

    @Override
    public String display() {
        return "Lightning Spell";
    }
}
