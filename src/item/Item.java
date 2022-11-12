package item;

import character.hero.Hero;
import character.monster.Monster;
import item.itemBehaviours.itemDisplayBehaviour.ItemDisplayBehaviour;
import item.itemBehaviours.itemType.ItemType;

public  class Item {
    //common attributes of all items
    public String name;
    public int required_level;
    public int cost;

    //strategy pattern objects
    protected ItemDisplayBehaviour itemDisplayBehaviour;
    protected ItemType itemType;

    //strategy pattern methods
    public void displayItem(){
        itemDisplayBehaviour.displayItem();
    };
    public String type() {
        return itemType.type();
    }


    public void use(Monster character, Hero hero){};
}
