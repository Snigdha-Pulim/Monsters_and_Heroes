package spell.behaviour;

import character.Monster;
import spell.Spell;

public class LightningSpell implements SpellBehaviour{
    Spell spell;

    public LightningSpell(Spell spell) {
        this.spell = spell;
    }

    @Override
    public void use(Monster M) {
        System.out.println("reduces the dodge chance of the target");
    }
}
