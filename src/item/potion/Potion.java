package item.potion;

import character.hero.Hero;
import item.Item;
import item.itemBehaviours.itemDisplayBehaviour.PotionDisplay;
import item.itemBehaviours.itemType.PotionType;
import item.potion.behaviour.PotionBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Potion extends Item {
    public int attribute_increase;
    //creating a list of strategy pattern objects for the different efffects of a potion!
    public List<PotionBehaviour> potionBehaviours=new ArrayList<PotionBehaviour>();

    protected Potion(){
        itemDisplayBehaviour=new PotionDisplay(this);
        itemType=new PotionType();
    }

    public void effect(Hero hero) {
        if (potionBehaviours != null) {
            for (PotionBehaviour potionBehaviour : potionBehaviours) {
                potionBehaviour.effect(hero);
            }
        }
    }

    ;
}