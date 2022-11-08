package character.hero.heroes.Warriors;

import character.hero.Hero;
import character.hero.levelUpBehaviour.WarriorLevelUp;

public class GaerdalIronhand extends Hero {
    GaerdalIronhand() {
        levelUpBehaviour = new WarriorLevelUp(this);
        name = "Gaerdal_Ironhand";
        MP = 100;
        strength = 700;
        agility = 500;
        dexterity = 600;
        gold = 1354;
        experience = 7;
    }
}
