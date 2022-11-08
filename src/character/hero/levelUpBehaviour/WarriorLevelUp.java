package character.hero.levelUpBehaviour;

import character.hero.Hero;

public class WarriorLevelUp implements LevelUpBehaviour{
    Hero hero;
    public WarriorLevelUp(Hero hero){
        this.hero=hero;
    }
    @Override
    public void levelUp() {
        System.out.println("leveling up for warriors");
    }
}
