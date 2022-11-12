package character;

import character.behavior.attack.Attack;
import character.behavior.display.Display;

public class Character {
    public String name;
    public int level;
    public int HP;
    protected Attack attack;
    protected Display display;
    protected Character(int level){
        this.level=level;
        this.HP=level*100;
    }
    public String attack(Character character){
        return attack.attack(character);
    }
    public void display(){
        display.display();
    }
}
