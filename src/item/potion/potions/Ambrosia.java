package item.potion.potions;

import item.potion.Potion;
import item.potion.behaviour.*;

public class Ambrosia extends Potion {
    public Ambrosia() {
        name = "Ambrosia";
        cost = 1000;
        required_level = 8;
        attribute_increase = 150;
        //calling the required potion behaviours for the kind of potion
        potionBehaviours.add(new ManaPotionBehaviour(this));
        potionBehaviours.add(new StrengthPotionBehaviour(this));
        potionBehaviours.add(new HealthPotionBehaviour(this));
        potionBehaviours.add(new AgilityPotionBehaviour(this));
        potionBehaviours.add(new DefensePotionBehaviour(this));
        potionBehaviours.add(new DexterityPotionBehaviour(this));
    }
}
