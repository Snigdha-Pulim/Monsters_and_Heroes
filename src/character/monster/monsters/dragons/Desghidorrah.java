package character.monster.monsters.dragons;

import character.monster.Monster;
import character.monster.favoredAttribute.Dragons;

public class Desghidorrah extends Monster {
    public Desghidorrah() {
        super(3);
        name = "Desghidorrah";
        base_damage = 300;
        defense = 400;
        dodge = 35;
        favoredAttribute=new Dragons(this);
    }
}
