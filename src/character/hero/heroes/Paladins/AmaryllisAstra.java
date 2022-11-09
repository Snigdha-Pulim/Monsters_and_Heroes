package character.hero.heroes.Paladins;

import character.hero.Hero;
import character.hero.levelUpBehaviour.PaladinLevelUp;

public class AmaryllisAstra extends Hero {
    public AmaryllisAstra() {
        levelUpBehaviour = new PaladinLevelUp(this);
        name = "Amaryllis_Astra";
        MP = 500;
        strength = 500;
        agility = 500;
        dexterity = 500;
        gold = 2500;
        experience = 5;
    }
}