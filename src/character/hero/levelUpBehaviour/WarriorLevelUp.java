package character.hero.levelUpBehaviour;

import character.hero.Hero;

public class WarriorLevelUp implements LevelUpBehaviour{
    Hero hero;
    public WarriorLevelUp(Hero hero){
        this.hero=hero;
    }
    @Override
    public void levelUp() {
        hero.strength=hero.strength*11/10;
        hero.dexterity=hero.dexterity*105/100;
        hero.agility=hero.agility*11/10;
    }

    @Override
    public String display() {
        return "Warrior";
    }
}
