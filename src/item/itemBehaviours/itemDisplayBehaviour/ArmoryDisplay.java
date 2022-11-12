package item.itemBehaviours.itemDisplayBehaviour;

import item.armory.Armory;

public class ArmoryDisplay implements ItemDisplayBehaviour {
    Armory armory;

    public ArmoryDisplay(Armory armory) {
        this.armory = armory;
    }

    @Override
    public void displayItem() {
        System.out.print("Armory: name=" + armory.name +
                "; cost=" + armory.cost + "; required_level="+
                armory.required_level+"; damage_reduction="+armory.damage_reduction);
    }
}
