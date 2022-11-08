package character.hero.levelUpBehaviour;

import character.hero.Hero;

public class SorcererLevelUp implements LevelUpBehaviour{
    Hero hero;
    public SorcererLevelUp(Hero hero){
        this.hero=hero;
    }
    @Override
    public void levelUp() {
        System.out.println("Sorcerer LevelUp");
    }
}
