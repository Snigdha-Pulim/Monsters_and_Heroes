package item.armory;

import item.armory.armories.*;

public class ArmoryFactory {

    public Armory getArmory(ArmoriesEnum armoriesEnum) {
        switch (armoriesEnum){
            case breastplate:
                return new Breastplate();
            case wizardShield:
                return new WizardShield();
            case fullBodyArmor:
                return new FullBodyArmor();
            case guardianAngel:
                return new GuardianAngel();
            case platinumShield:
                return new PlatinumShield();
            default:
                return null;
        }

    }
}
