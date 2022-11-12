package item.weaponry;

import character.hero.Hero;
import character.monster.Monster;
import item.Item;
import item.itemBehaviours.itemDisplayBehaviour.WeaponryDisplay;
import item.itemBehaviours.itemType.WeaponryType;

public class Weaponry extends Item {
    public int required_hands;
    public int damage;

    protected Weaponry() {
        //strategy patterns declared in item
        itemDisplayBehaviour = new WeaponryDisplay(this);
        itemType = new WeaponryType();
    }

    //effect of weapon on a monster
    public void use(Monster monster, Hero hero) {
        monster.HP = monster.HP - (hero.strength + damage) * 5 / 100;
        monster.defense=monster.defense*90/100;
    }
}
