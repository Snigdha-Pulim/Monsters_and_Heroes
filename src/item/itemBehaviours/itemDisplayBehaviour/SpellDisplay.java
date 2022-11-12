package item.itemBehaviours.itemDisplayBehaviour;

import item.spell.Spell;

public class SpellDisplay implements ItemDisplayBehaviour{
    Spell spell;
    public SpellDisplay(Spell spell){
        this.spell=spell;
    }
    @Override
    public void displayItem() {
        System.out.print("Spell: name=" + spell.name +
                "; cost=" + spell.cost + "; required_level="+
                spell.required_level+"; mana_cost="+spell.mana_cost+"; spell type="+spell.spellBehaviour.display());
    }
}
