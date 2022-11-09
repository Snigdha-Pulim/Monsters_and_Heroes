package character.hero.heroes.Paladins;

import character.hero.Hero;
import character.hero.levelUpBehaviour.PaladinLevelUp;

public class Parzival extends Hero {
    public Parzival(){
        levelUpBehaviour=new PaladinLevelUp(this);
        name="Parzival";
        MP=300;
        strength=750;
        agility=650;
        dexterity=700;
        gold=2500;
        experience=7;
    }
}