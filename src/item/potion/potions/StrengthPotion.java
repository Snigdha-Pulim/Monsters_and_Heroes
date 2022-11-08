package item.potion.potions;

import item.potion.Potion;
import item.potion.behaviour.StrengthPotionBehaviour;

public class StrengthPotion extends Potion {
    public StrengthPotion() {
        name = "Strength_Potion";
        cost = 200;
        required_level = 1;
        attribute_increase = 75;
        potionBehaviours.add(new StrengthPotionBehaviour());
    }
}
