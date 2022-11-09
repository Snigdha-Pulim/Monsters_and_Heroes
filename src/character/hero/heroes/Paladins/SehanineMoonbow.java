package character.hero.heroes.Paladins;

import character.hero.Hero;
import character.hero.levelUpBehaviour.PaladinLevelUp;

public class SehanineMoonbow extends Hero {
    public SehanineMoonbow(){
        levelUpBehaviour=new PaladinLevelUp(this);
        name="Sehanine_Moonbow";
        MP=300;
        strength=750;
        agility=750;
        dexterity=700;
        gold=2500;
        experience=7;
    }
}