package item.potion.behaviour;

import character.hero.Hero;

public class AgilityPotionBehaviour implements PotionBehaviour{
    @Override
    public void effect(Hero hero) {
        System.out.println("Agility Potion");
    }
}
