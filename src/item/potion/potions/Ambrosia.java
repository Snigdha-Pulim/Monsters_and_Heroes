package item.potion.potions;

import item.potion.Potion;
import item.potion.behaviour.*;

public class Ambrosia extends Potion {
    public Ambrosia() {
        name = "Ambrosia";
        cost = 1000;
        required_level = 8;
        attribute_increase = 150;
        potionBehaviours.add(new ManaPotionBehaviour());
        potionBehaviours.add(new StrengthPotionBehaviour());
        potionBehaviours.add(new HealthPotionBehaviour());
        potionBehaviours.add(new AgilityPotionBehaviour());
        potionBehaviours.add(new DefensePotionBehaviour());
        potionBehaviours.add(new DexterityPotionBehaviour());
    }
}
