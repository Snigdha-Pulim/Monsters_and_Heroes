package character.hero.heroes.Warriors;

import character.hero.Hero;
import character.hero.levelUpBehaviour.WarriorLevelUp;

public class UndefeatedYoj extends Hero {
    public UndefeatedYoj() {
        levelUpBehaviour = new WarriorLevelUp(this);
        name = "Undefeated_Yoj";
        MP = 400;
        strength = 800;
        agility = 400;
        dexterity = 700;
        gold = 2500;
        experience = 7;
    }
}
