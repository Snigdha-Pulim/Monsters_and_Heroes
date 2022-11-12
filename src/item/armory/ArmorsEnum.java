package item.armory;

public enum ArmorsEnum {

    Breastplate(350, 3, 600),
    FullBodyArmor(1000, 8, 1100),
    GuardianAngel(1000, 10, 1000),
    PlatinumShield(150, 1, 200),
    WizardShield(1200, 10, 1500);

    private final int cost;
    private final int required_level;
    private final int damage_reduction;

    ArmorsEnum(int cost,
               int required_level,
               int damage_reduction) {
        this.cost = cost;
        this.damage_reduction = damage_reduction;
        this.required_level = required_level;
    }

    public int getCost() {
        return cost;
    }

    public int getDamage() {
        return damage_reduction;
    }

    public int getLevel() {
        return required_level;
    }

}
