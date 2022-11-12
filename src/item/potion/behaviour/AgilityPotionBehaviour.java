package item.potion.behaviour;

import character.hero.Hero;
import item.potion.Potion;

public class AgilityPotionBehaviour implements PotionBehaviour{
    Potion potion;
    public AgilityPotionBehaviour(Potion potion){
        this.potion=potion;
    }
    @Override
    public void effect(Hero hero) {
        hero.agility=hero.agility+potion.attribute_increase;
    }
    public String display(){
        return "Agility";
    }
}
