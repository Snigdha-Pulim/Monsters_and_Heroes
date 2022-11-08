package character.hero.levelUpBehaviour;

import character.hero.Hero;

public class PaladinLevelUp implements LevelUpBehaviour{
    Hero hero;
    public PaladinLevelUp(Hero hero){
        this.hero=hero;
    }
    @Override
    public void levelUp() {
        System.out.println("Paladin LevelUp");
    }
}
