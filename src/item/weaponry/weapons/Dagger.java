package item.weaponry.weapons;

import item.weaponry.Weaponry;

public class Dagger extends Weaponry {
    public Dagger() {
        name = "Dagger";
        cost = 200;
        required_level = 1;
        damage = 250;
        required_hands = 1;
    }
}
