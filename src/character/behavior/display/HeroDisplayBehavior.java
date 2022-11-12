package character.behavior.display;

import character.hero.Hero;
import item.Item;

public class HeroDisplayBehavior implements Display{
    Hero hero;
    public HeroDisplayBehavior(Hero hero){
        this.hero=hero;
    }
    @Override
    public void display() {
        System.out.println("Hero: ("+hero.levelUpBehaviour.display()+")");
        System.out.println("name="+hero.name+"; level="+hero.level+"; HP="+hero.HP+
                "; strength="+hero.strength+"; dexterity="+hero.dexterity+"; agility="+
                hero.agility+"; gold="+hero.gold+"; experience="+hero.experience+"; MP="+hero.MP);
        System.out.print("inventory: ");
        for(Item inventoryItem:hero.inventory){
            System.out.print(inventoryItem.name+", ");
        }
        System.out.println();
    }
}
