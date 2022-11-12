package character.monster.favoredAttribute;

import character.monster.Monster;

public class Spirits implements FavoredAttribute {
    Monster monster;

    public Spirits(Monster monster) {
        this.monster = monster;
        monster.dodge = monster.dodge * 110 / 100;
    }

    @Override
    public void attributeToIncrease() {
        monster.dodge = monster.dodge * 110 / 100;
    }

    @Override
    public String display() {
        return "Spirit";
    }
}
