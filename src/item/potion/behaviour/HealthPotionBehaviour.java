package item.potion.behaviour;

import character.hero.Hero;

public class HealthPotionBehaviour implements PotionBehaviour{
    @Override
    public void effect(Hero hero) {
        System.out.println("health Potion");
    }
}
