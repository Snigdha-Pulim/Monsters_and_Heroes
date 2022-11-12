package item.armory;

import item.Item;
import item.itemBehaviours.itemDisplayBehaviour.ArmoryDisplay;
import item.itemBehaviours.itemType.ArmoryType;

public class Armory extends Item {
    public int damage_reduction;

    protected Armory(){
        itemDisplayBehaviour=new ArmoryDisplay(this);
        itemType=new ArmoryType();
    }

}
