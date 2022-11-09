package character.monster.favoredAttribute;

import character.monster.Monster;

public class Dragons implements FavoredAttribute{
    Monster monster;
    public Dragons(Monster monster){
        this.monster=monster;
    }
    @Override
    public void attributeToIncrease(Monster monster) {
        System.out.println("dragons");
    }
}
