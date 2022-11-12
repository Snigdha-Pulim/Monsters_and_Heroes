package item.spell.behaviour;

import character.hero.Hero;
import character.monster.Monster;
import item.spell.Spell;

//strategy pattern for different types of spells
public class FireSpell implements SpellBehaviour{
    Spell spell;
    public FireSpell(Spell spell){
        this.spell=spell;
    }
    @Override
    public void use(Monster monster , Hero hero) {
        monster.defense=(monster.defense*9/10);
    }

    @Override
    public String display() {
        return "Fire Spell";
    }

}
