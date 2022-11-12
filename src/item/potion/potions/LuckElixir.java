package item.potion.potions;

import item.potion.Potion;
import item.potion.behaviour.AgilityPotionBehaviour;

public class LuckElixir extends Potion {
    public LuckElixir() {
        name = "Luck_Elixir";
        cost = 500;
        required_level = 4;
        attribute_increase = 65;
        potionBehaviours.add(new AgilityPotionBehaviour(this));
    }
}
