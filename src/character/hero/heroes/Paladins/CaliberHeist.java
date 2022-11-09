package character.hero.heroes.Paladins;

import character.hero.Hero;
import character.hero.levelUpBehaviour.PaladinLevelUp;

public class CaliberHeist extends Hero {
    public CaliberHeist() {
        levelUpBehaviour = new PaladinLevelUp(this);
        name = "Caliber_Heist";
        MP = 400;
        strength = 400;
        agility = 400;
        dexterity = 400;
        gold = 2500;
        experience = 8;
    }
}