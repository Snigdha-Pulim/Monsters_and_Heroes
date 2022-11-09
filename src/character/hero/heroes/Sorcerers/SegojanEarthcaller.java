package character.hero.heroes.Sorcerers;

import character.hero.Hero;
import character.hero.levelUpBehaviour.SorcererLevelUp;

public class SegojanEarthcaller extends Hero {
    public SegojanEarthcaller(){
        levelUpBehaviour=new SorcererLevelUp(this);
        name="Segojan_Earthcaller";
        MP=900;
        strength=800;
        agility=500;
        dexterity=650;
        gold=2500;
        experience=5;
    }
}
