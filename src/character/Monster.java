package character;

import character.behavior.attack.AttackWithOutWeapon;

public class Monster extends Character{
    protected int base_damage;
    public Monster(int level){
        super(level);
        attack=new AttackWithOutWeapon();
    }
}
