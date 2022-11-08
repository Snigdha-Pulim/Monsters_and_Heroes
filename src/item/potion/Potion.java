package item.potion;

import character.hero.Hero;
import item.Item;
import item.potion.behaviour.PotionBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Potion extends Item {
    protected int attribute_increase;
    protected List<PotionBehaviour> potionBehaviours=new ArrayList<PotionBehaviour>();

    public void effect(Hero hero) {
        if (potionBehaviours != null) {
            for (PotionBehaviour potionBehaviour : potionBehaviours) {
                potionBehaviour.effect(hero);
            }
        }
    }

    ;
}