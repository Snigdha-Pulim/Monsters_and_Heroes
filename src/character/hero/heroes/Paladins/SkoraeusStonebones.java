package character.hero.heroes.Paladins;

import character.hero.Hero;
import character.hero.levelUpBehaviour.PaladinLevelUp;

public class SkoraeusStonebones extends Hero {
    public SkoraeusStonebones(){
        levelUpBehaviour=new PaladinLevelUp(this);
        name="Skoraeus_Stonebones";
        MP=250;
        strength=650;
        agility=600;
        dexterity=350;
        gold=2500;
        experience=4;
    }
}