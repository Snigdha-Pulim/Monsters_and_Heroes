package item.potion.behaviour;

import character.hero.Hero;

public class DexterityPotionBehaviour implements PotionBehaviour{
    @Override
    public void effect(Hero hero) {
        System.out.println("Dexterity Potion");
    }
}
