package character.hero.levelUpBehaviour;

import character.hero.Hero;

public class SorcererLevelUp implements LevelUpBehaviour{
    Hero hero;
    public SorcererLevelUp(Hero hero){
        this.hero=hero;
    }
    @Override
    public void levelUp() {
        hero.strength=hero.strength*105/100;
        hero.dexterity=hero.dexterity*11/10;
        hero.agility=hero.agility*11/10;
    }

    @Override
    public String display() {
        return "Sorcerer";
    }
}
