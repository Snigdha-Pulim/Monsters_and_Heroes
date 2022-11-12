package item.itemBehaviours.itemDisplayBehaviour;

import item.potion.Potion;
import item.potion.behaviour.PotionBehaviour;

public class PotionDisplay implements ItemDisplayBehaviour{
    Potion potion;
    public PotionDisplay(Potion potion){
        this.potion=potion;
    }
    @Override
    public void displayItem() {
        System.out.print("Potion: name=" + potion.name +
                "; cost=" + potion.cost + "; required_level="+
                potion.required_level+"; attribute_increase="+potion.attribute_increase+"; effects=");
        for(PotionBehaviour potionBehaviour: potion.potionBehaviours){
            System.out.print(potionBehaviour.display()+", ");
        }
    }
}
