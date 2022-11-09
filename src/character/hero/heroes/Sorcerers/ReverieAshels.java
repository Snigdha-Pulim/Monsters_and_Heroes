package character.hero.heroes.Sorcerers;

import character.hero.Hero;
import character.hero.levelUpBehaviour.SorcererLevelUp;

public class ReverieAshels extends Hero {
    public ReverieAshels(){
        levelUpBehaviour=new SorcererLevelUp(this);
        name="Reverie_Ashels";
        MP=900;
        strength=800;
        agility=700;
        dexterity=400;
        gold=2500;
        experience=7;
    }
}
