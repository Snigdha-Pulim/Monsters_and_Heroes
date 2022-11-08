package character.hero.heroes.Warriors;

import character.hero.Hero;
import character.hero.levelUpBehaviour.WarriorLevelUp;

public class SehanineMonnbow extends Hero {
    SehanineMonnbow() {
        levelUpBehaviour = new WarriorLevelUp(this);
        name = "Sehanine_Monnbow";
        MP = 600;
        strength = 700;
        agility = 800;
        dexterity = 500;
        gold = 2500;
        experience = 8;
    }
}
