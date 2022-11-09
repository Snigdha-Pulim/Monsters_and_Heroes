package item.weaponry;

import item.weaponry.weapons.*;

public class WeaponryFactory {
    public static Weaponry getWeaponry(WeaponsEnum weaponsEnum){
        switch (weaponsEnum){
            case Axe:
                return new Axe();
            case Bow:
                return new Bow();
            case Sword:
                return new Sword();
            case Dagger:
                return new Dagger();
            case Scythe:
                return new Scythe();
            case TSwords:
                return new TSwords();
            default:
                return null;
        }
    }
}
