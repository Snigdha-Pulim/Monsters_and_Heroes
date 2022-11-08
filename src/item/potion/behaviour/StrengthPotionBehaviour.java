package item.potion.behaviour;

import character.hero.Hero;

public class StrengthPotionBehaviour implements PotionBehaviour{
    @Override
    public void effect(Hero hero) {
        System.out.println("Strength Potion");
    }
}
