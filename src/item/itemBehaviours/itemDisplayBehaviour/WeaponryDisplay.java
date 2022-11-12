package item.itemBehaviours.itemDisplayBehaviour;

import item.weaponry.Weaponry;

public class WeaponryDisplay implements ItemDisplayBehaviour {
    Weaponry weaponry;

    public WeaponryDisplay(Weaponry weaponry) {
        this.weaponry = weaponry;
    }

    @Override
    public void displayItem() {
        System.out.print("Weaponry: name=" + weaponry.name +
                "; cost=" + weaponry.cost + "; required_level=" +
                weaponry.required_level + "; damage=" + weaponry.damage + "; required_hands=" + weaponry.required_hands
        );
    }
}
