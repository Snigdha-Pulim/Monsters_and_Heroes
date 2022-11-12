package item.potion;

import item.potion.behaviour.PotionBehaviour;
import item.potion.potions.*;

import java.util.ArrayList;
import java.util.List;

public class PotionFactory {
    public static Potion getPotion(PotionsEnum potionsEnum){
        switch (potionsEnum){
            case MagicPotion:
                return new MagicPotion();
            case Ambrosia:
                return new Ambrosia();
            case HealingPotion:
                return new HealingPotion();
            case LuckElixir:
                return new LuckElixir();
            case MermaidTears:
                return new MermaidTears();
            case StrengthPotion:
                return new StrengthPotion();
            default:
                return null;
        }
    }
}
