package character.hero.heroes.Warriors;

import character.hero.Hero;
import character.hero.levelUpBehaviour.WarriorLevelUp;

public class MuammanDuathall extends Hero {
    public MuammanDuathall() {
        levelUpBehaviour = new WarriorLevelUp(this);
        name = "Muamman_Duathall";
        MP = 300;
        strength = 900;
        agility = 500;
        dexterity = 750;
        gold = 2546;
        experience = 6;
    }
}
