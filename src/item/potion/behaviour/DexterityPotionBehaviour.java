package item.potion.behaviour;

import character.hero.Hero;
import item.potion.Potion;

public class DexterityPotionBehaviour implements PotionBehaviour{
    Potion potion;
    public DexterityPotionBehaviour(Potion potion){
        this.potion=potion;
    }
    @Override
    public void effect(Hero hero) {
        hero.dexterity=hero.dexterity+potion.attribute_increase;
    }

    @Override
    public String display() {
        return "Dexterity";
    }
}
