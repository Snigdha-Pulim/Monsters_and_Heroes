package item.potion.behaviour;

import character.hero.Hero;
import item.potion.Potion;

public class ManaPotionBehaviour implements PotionBehaviour{
    Potion potion;
    public ManaPotionBehaviour(Potion potion){
        this.potion=potion;
    }
    @Override
    public void effect(Hero hero) {
        hero.MP=hero.MP+potion.attribute_increase;
    }

    @Override
    public String display() {
        return "Mana";
    }
}
