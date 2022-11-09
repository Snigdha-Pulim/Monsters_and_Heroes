package character.monster.favoredAttribute;

import character.monster.Monster;

public class Spirits implements FavoredAttribute{
    Monster monster;
    public Spirits(Monster monster){
        this.monster=monster;
    }
    @Override
    public void attributeToIncrease(Monster monster) {
        System.out.println("spirits");
    }
}
