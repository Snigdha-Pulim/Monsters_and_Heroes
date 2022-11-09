package character.monster;

import character.Character;
import character.behavior.attack.AttackWithOutWeapon;
import character.monster.favoredAttribute.FavoredAttribute;

public class Monster extends Character {
    protected int base_damage;
    protected int defense;
    protected int dodge;
    protected FavoredAttribute favoredAttribute;

    public Monster(int level){
        super(level);
        attack=new AttackWithOutWeapon();
    }

    public void attributeToIncrease(Monster monster){
        favoredAttribute.attributeToIncrease(monster);
    };

    public void decreaseHP(int value){HP=HP-value;};

}
