package character.hero.heroes.Sorcerers;

import character.hero.Hero;
import character.hero.levelUpBehaviour.SorcererLevelUp;

public class SkyeSoar extends Hero {
    public SkyeSoar(){
        levelUpBehaviour=new SorcererLevelUp(this);
        name="Skye_Soar";
        MP=1000;
        strength=700;
        agility=400;
        dexterity=500;
        gold=2500;
        experience=5;
    }
}
