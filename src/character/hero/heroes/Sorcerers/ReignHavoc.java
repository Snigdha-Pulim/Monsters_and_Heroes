package character.hero.heroes.Sorcerers;

import character.hero.Hero;
import character.hero.levelUpBehaviour.SorcererLevelUp;

public class ReignHavoc extends Hero {
    ReignHavoc(){
        levelUpBehaviour=new SorcererLevelUp(this);
        name="Reign_Havoc";
        MP=800;
        strength=800;
        agility=800;
        dexterity=850;
        gold=2500;
        experience=8;
    }
}
