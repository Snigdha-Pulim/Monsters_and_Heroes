package character.hero.heroes.Warriors;

import character.hero.Hero;
import character.hero.levelUpBehaviour.WarriorLevelUp;

public class EunoiaCyn extends Hero {
    public EunoiaCyn() {
        levelUpBehaviour = new WarriorLevelUp(this);
        name = "Eunoia_Cyn";
        MP = 400;
        strength = 700;
        agility = 800;
        dexterity = 600;
        gold = 2500;
        experience = 6;
    }
}
