package item.potion.behaviour;

import character.hero.Hero;
import item.potion.Potion;

public class DefensePotionBehaviour implements PotionBehaviour {
    Potion potion;

    public DefensePotionBehaviour(Potion potion) {
        this.potion = potion;
    }

    @Override
    public void effect(Hero hero) {
        if (hero.currentlySelectedArmory != null) {
            hero.currentlySelectedArmory.damage_reduction = hero.currentlySelectedArmory.damage_reduction + potion.attribute_increase;
        }
    }

    @Override
    public String display() {
        return "Defense";
    }


}
