package spell.behaviour;

import character.Monster;
import spell.Spell;

public class IceSpell implements SpellBehaviour {
    Spell spell;

    public IceSpell(Spell spell) {
        this.spell = spell;
    }

    @Override
    public void use(Monster M) {
        System.out.println("reduces the damage of the target");
    }
}
