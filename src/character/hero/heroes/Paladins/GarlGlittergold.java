package character.hero.heroes.Paladins;

import character.hero.Hero;
import character.hero.levelUpBehaviour.PaladinLevelUp;

public class GarlGlittergold extends Hero {
    GarlGlittergold() {
        levelUpBehaviour = new PaladinLevelUp(this);
        name = "Garl_Glittergold";
        MP = 100;
        strength = 600;
        agility = 500;
        dexterity = 400;
        gold = 2500;
        experience = 5;
    }
}