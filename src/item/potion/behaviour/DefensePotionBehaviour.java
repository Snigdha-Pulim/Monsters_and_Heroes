package item.potion.behaviour;

import character.hero.Hero;

public class DefensePotionBehaviour implements PotionBehaviour{
    @Override
    public void effect(Hero hero) {
        System.out.println("Defense Potion");
    }
}
