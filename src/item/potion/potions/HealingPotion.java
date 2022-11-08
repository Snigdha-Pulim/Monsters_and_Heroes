package item.potion.potions;

import item.potion.Potion;
import item.potion.behaviour.HealthPotionBehaviour;

public class HealingPotion extends Potion {
    public HealingPotion() {
        name = "Healing_Potion";
        cost = 250;
        required_level = 1;
        attribute_increase = 100;
        potionBehaviours.add(new HealthPotionBehaviour());
    }
}
