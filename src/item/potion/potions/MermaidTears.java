package item.potion.potions;

import item.potion.Potion;
import item.potion.behaviour.AgilityPotionBehaviour;
import item.potion.behaviour.HealthPotionBehaviour;
import item.potion.behaviour.ManaPotionBehaviour;
import item.potion.behaviour.StrengthPotionBehaviour;

public class MermaidTears extends Potion {
    public MermaidTears() {
        name = "Mermaid_Tears";
        cost = 850;
        required_level = 5;
        attribute_increase = 100;
        potionBehaviours.add(new HealthPotionBehaviour(this));
        potionBehaviours.add(new ManaPotionBehaviour(this));
        potionBehaviours.add(new StrengthPotionBehaviour(this));
        potionBehaviours.add(new AgilityPotionBehaviour(this));
    }
}
