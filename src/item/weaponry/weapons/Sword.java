package item.weaponry.weapons;

import item.weaponry.Weaponry;

public class Sword extends Weaponry {
    public Sword() {
        name = "Sword";
        cost = 500;
        required_level = 1;
        damage = 800;
        required_hands = 1;
    }
}
