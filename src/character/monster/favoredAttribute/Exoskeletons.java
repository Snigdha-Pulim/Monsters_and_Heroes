package character.monster.favoredAttribute;

import character.monster.Monster;

public class Exoskeletons implements FavoredAttribute{
    Monster monster;
    public Exoskeletons(Monster monster){
        this.monster=monster;
    }
    @Override
    public void attributeToIncrease(Monster monster) {
        System.out.println("exoskeleton");
    }
}
