package item.potion;

public enum PotionsEnum {
    Ambrosia(1000, 8, 150, new String[]{"Health", "Mana", "Strength", "Dexterity", "Defense", "Agility"}),
    HealingPotion(250, 1, 100, new String[]{"Health"}),
    LuckElixir(500, 4, 65, new String[]{"Agility"}),
    MagicPotion(350, 2, 100, new String[]{"Mana"}),
    MermaidTears(850, 5, 100, new String[]{"Health", "Mana", "Strength", "Agility"}),
    StrengthPotion(200, 1, 75, new String[]{"Strength"});

    private final String[] effect;
    private final int cost;
    private final int required_level;
    private final int attribute_increase;

    PotionsEnum(int cost, int required_level, int attribute_increase, String[] effect) {
        this.effect = effect;
        this.cost = cost;
        this.required_level = required_level;
        this.attribute_increase = attribute_increase;
    }

    public int getCost(){return cost;}
    public int getRequiredLevel(){return required_level;}
    public int getAttributeIncrease(){return attribute_increase;}
    public String[] getEffects(){return effect;}

}
