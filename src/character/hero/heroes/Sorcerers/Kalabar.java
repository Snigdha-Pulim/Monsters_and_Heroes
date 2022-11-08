package character.hero.heroes.Sorcerers;

import character.hero.Hero;
import character.hero.levelUpBehaviour.SorcererLevelUp;

public class Kalabar extends Hero {
    Kalabar(){
        levelUpBehaviour=new SorcererLevelUp(this);
        name="Kalabar";
        MP=800;
        strength=850;
        agility=400;
        dexterity=600;
        gold=2500;
        experience=6;
    }
}
