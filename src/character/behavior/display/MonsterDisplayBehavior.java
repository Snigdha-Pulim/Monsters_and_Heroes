package character.behavior.display;

import character.monster.Monster;
import item.Item;

public class MonsterDisplayBehavior implements Display{
    Monster monster;
    public MonsterDisplayBehavior(Monster monster){
        this.monster=monster;
    }
    @Override
    public void display() {
        System.out.println("Monster: ("+monster.favoredAttribute.display()+")");
        System.out.println("name="+monster.name+"; level="+monster.level+"; HP="+monster.HP+
                "; base_damage="+monster.base_damage+"; defense="+monster.defense+"; dodge="+
                monster.dodge);

        System.out.println();
    }
}
