package item.spell.behaviour;

import character.monster.Monster;
import item.spell.Spell;

public class FireSpell implements SpellBehaviour{
    Spell spell;
    public FireSpell(Spell spell){
        this.spell=spell;
    }
    @Override
    public void use(Monster M) {
        System.out.println("reduces the defense of the target");
    }
}
