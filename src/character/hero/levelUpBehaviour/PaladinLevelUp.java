package character.hero.levelUpBehaviour;

import character.hero.Hero;

public class PaladinLevelUp implements LevelUpBehaviour{
    Hero hero;
    public PaladinLevelUp(Hero hero){
        this.hero=hero;
    }
    @Override
    public void levelUp() {
        hero.strength=hero.strength*11/10;
        hero.dexterity=hero.dexterity*11/10;
        hero.agility=hero.agility*105/100;
    }

    @Override
    public String display() {
        return "Paladin";
    }
}
