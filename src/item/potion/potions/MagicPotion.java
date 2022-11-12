package item.potion.potions;

import item.potion.Potion;
import item.potion.behaviour.ManaPotionBehaviour;

public class MagicPotion extends Potion {
    public MagicPotion() {
        name = "Magic_Potion";
        cost = 350;
        required_level = 2;
        attribute_increase = 100;
        potionBehaviours.add(new ManaPotionBehaviour(this));
    }
}
