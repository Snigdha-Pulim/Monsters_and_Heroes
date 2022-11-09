package item.armory;

import item.armory.armors.*;

public class ArmoryFactory {

    public static Armory getArmory(ArmorsEnum armorsEnum) {
        switch (armorsEnum){
            case Breastplate:
                return new Breastplate();
            case WizardShield:
                return new WizardShield();
            case FullBodyArmor:
                return new FullBodyArmor();
            case GuardianAngel:
                return new GuardianAngel();
            case PlatinumShield:
                return new PlatinumShield();
            default:
                return null;
        }

    }
}
