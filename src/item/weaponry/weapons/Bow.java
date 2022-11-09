package item.weaponry.weapons;

import item.weaponry.Weaponry;

public class Bow extends Weaponry {
    public Bow() {
        name = "Bow";
        cost = 300;
        required_level = 2;
        damage = 500;
        required_hands = 2;
    }
}
