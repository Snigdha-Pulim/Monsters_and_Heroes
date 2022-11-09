package character.hero.heroes.Warriors;

import character.hero.Hero;
import character.hero.levelUpBehaviour.WarriorLevelUp;

public class FlandalSteelskin extends Hero {
    public FlandalSteelskin() {
        levelUpBehaviour = new WarriorLevelUp(this);
        name = "Flandal_Steelskin";
        MP = 200;
        strength = 750;
        agility = 650;
        dexterity = 700;
        gold = 2500;
        experience = 7;
    }
}
