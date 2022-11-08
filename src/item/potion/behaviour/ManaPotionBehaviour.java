package item.potion.behaviour;

import character.hero.Hero;

public class ManaPotionBehaviour implements PotionBehaviour{
    @Override
    public void effect(Hero hero) {
        System.out.println("Mana Potion");
    }
}
