package character.monster.favoredAttribute;

import character.monster.Monster;

public class Exoskeletons implements FavoredAttribute{
    Monster monster;
    public Exoskeletons(Monster monster){
        this.monster=monster;
        monster.defense=monster.defense*110/100;
    }
    @Override
    public void attributeToIncrease() {
        monster.defense=monster.defense*110/100;
    }

    @Override
    public String display() {
        return "Exoskeleton";
    }
}
