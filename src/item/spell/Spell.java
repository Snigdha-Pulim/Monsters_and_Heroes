package item.spell;

import character.hero.Hero;
import character.monster.Monster;
import item.Item;
import item.itemBehaviours.itemDisplayBehaviour.SpellDisplay;
import item.itemBehaviours.itemType.SpellType;
import item.spell.behaviour.SpellBehaviour;

public class Spell extends Item {
    public int damage;
    public int mana_cost;
    //strategy pattern object for different types of spells
    public SpellBehaviour spellBehaviour;

    protected Spell(){
        //strategy pattern objects while were declared in item
        itemDisplayBehaviour=new SpellDisplay(this);
        itemType=new SpellType();
    }
    public void use(Monster monster , Hero hero){
        monster.HP=monster.HP-(damage+(hero.dexterity/10000)*damage);
        hero.MP=hero.MP-mana_cost;
        spellBehaviour.use(monster,hero);
    }
}
