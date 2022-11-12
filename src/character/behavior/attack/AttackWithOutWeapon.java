package character.behavior.attack;

import character.Character;
import character.hero.Hero;
import character.monster.Monster;

import java.util.Random;

public class AttackWithOutWeapon implements Attack {
    Monster monster;

    public AttackWithOutWeapon(Monster monster) {
        this.monster = monster;
    }

    @Override
    public String attack(Character character) {
        String returnString="";
        Random rand = new Random();
        boolean dodge = rand.nextInt(100) <= ((Hero) character).agility * 2 / 1000;
        if (!dodge) {
            if (((Hero) character).currentlySelectedArmory == null) {
                character.HP = character.HP - (monster.base_damage) / 10;
                returnString=returnString+monster.name+" attacked and reducded "+character.name+" HP to "+character.HP+"!\n";
            } else {
                character.HP = character.HP -
                        (((monster.base_damage) / 10)
                                - (((Hero) character).currentlySelectedArmory.required_level * 5 / 100));

                returnString=returnString+monster.name+" attacked and reducded "+character.name+" HP to "+character.HP+"!\n";
            }
        } else {
            return character.name + " dodged " + monster.name + "'s attack\n";
        }
        return returnString;
    }
}
