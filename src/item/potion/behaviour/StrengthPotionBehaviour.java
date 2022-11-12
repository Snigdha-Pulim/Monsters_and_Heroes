package item.potion.behaviour;

import character.hero.Hero;
import item.potion.Potion;

public class StrengthPotionBehaviour implements PotionBehaviour{
    Potion potion;
    public StrengthPotionBehaviour(Potion potion){
        this.potion=potion;
    }
    @Override
    public void effect(Hero hero) {
        hero.strength=hero.strength+potion.attribute_increase;
    }
    public String display(){
        return "Strength";
    }
}
