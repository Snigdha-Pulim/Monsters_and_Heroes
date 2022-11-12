package character.behavior.attack;

import character.Character;
import character.hero.Hero;
import character.monster.Monster;
import item.Item;

import java.util.Random;

public class AttackWithWeapon implements Attack {
    Hero hero;
    public AttackWithWeapon(Hero hero){
        this.hero=hero;
    }
    @Override
    public String attack(Character character) {
        Random rand = new Random();
        boolean dodge=rand.nextInt(100)<=((Monster) character).dodge/10;
        String returnString="";
        if(!dodge){
            if(hero.currentAttackItems.isEmpty()){
                return hero.name+" attacked "+character.name+" without any spells/weapon";
            }
            for (Item item : hero.currentAttackItems) {
                item.use((Monster) character,hero);
                returnString=returnString+hero.name+" attacked "+character.name+" with a "+item.name+" and reduced HP to "+character.HP+"\n";
            }
        }else {
            return character.name+" dodged "+hero.name+"'s attack\n";
        }
        return returnString;
    }
}
