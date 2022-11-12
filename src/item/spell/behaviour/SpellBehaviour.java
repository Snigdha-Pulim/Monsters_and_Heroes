package item.spell.behaviour;

import character.hero.Hero;
import character.monster.Monster;

//strategy pattern for different types of spells
public interface SpellBehaviour {
    public void use(Monster monster , Hero hero);
    public String display();
}
