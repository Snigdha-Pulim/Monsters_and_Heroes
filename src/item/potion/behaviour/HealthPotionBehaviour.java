package item.potion.behaviour;

import character.hero.Hero;
import item.potion.Potion;

public class HealthPotionBehaviour implements PotionBehaviour{
    Potion potion;
    public HealthPotionBehaviour(Potion potion){
        this.potion=potion;
    }
    @Override
    public void effect(Hero hero) {
        hero.HP=hero.HP+potion.attribute_increase;
    }

    @Override
    public String display() {
        return "Health";
    }
}
