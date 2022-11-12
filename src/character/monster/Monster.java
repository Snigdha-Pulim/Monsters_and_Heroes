package character.monster;

import character.Character;
import character.behavior.attack.AttackWithOutWeapon;
import character.behavior.display.MonsterDisplayBehavior;
import character.monster.favoredAttribute.FavoredAttribute;

public class Monster extends Character {
    public int base_damage;
    public int defense;
    public int dodge;
    public FavoredAttribute favoredAttribute;

    public Monster(int level){
        super(level);
        attack=new AttackWithOutWeapon(this);
        display=new MonsterDisplayBehavior(this);
    }

    public int getLevel(){
        return level;
    }

    public void attributeToIncrease(){
        favoredAttribute.attributeToIncrease();
    };

    public void decreaseHP(int value){HP=HP-value;};

}
