package character.hero.heroes.Sorcerers;

import character.hero.Hero;
import character.hero.levelUpBehaviour.SorcererLevelUp;

public class RillifaneRallathil extends Hero {
    RillifaneRallathil(){
        levelUpBehaviour=new SorcererLevelUp(this);
        name="Rillifane_Rallathil";
        MP=1300;
        strength=750;
        agility=450;
        dexterity=500;
        gold=2500;
        experience=9;
    }
}
