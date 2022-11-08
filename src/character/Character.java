package character;

import character.behavior.attack.Attack;

public class Character {
    protected String name;
    protected int level;
    protected int HP;
    protected Attack attack;
    protected Character(int level){
        this.level=level;
        this.HP=level*100;
    }
    public boolean dodge(){
        System.out.println("will dodge according to its dodge value");
        return true;
    }
    public int attack(){
        return attack.attack();
    }
}
