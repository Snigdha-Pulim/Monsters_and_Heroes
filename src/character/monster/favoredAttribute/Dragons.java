package character.monster.favoredAttribute;

import character.monster.Monster;

public class Dragons implements FavoredAttribute{
    Monster monster;
    public Dragons(Monster monster){
        this.monster=monster;
        monster.base_damage=monster.base_damage*110/100;
    }
    @Override
    public void attributeToIncrease() {
        monster.base_damage=monster.base_damage*110/100;
    }

    @Override
    public String display() {
        return "Dragon";
    }
}
