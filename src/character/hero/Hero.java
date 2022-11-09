package character.hero;

import character.Character;
import character.behavior.attack.AttackWithWeapon;
import character.hero.levelUpBehaviour.LevelUpBehaviour;
import item.Item;
import item.spell.Spell;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Character {
    protected int strength;
    protected int dexterity;
    protected int agility;
    protected int gold;
    protected int experience;
    protected int MP;
    protected LevelUpBehaviour levelUpBehaviour;
    List<Item> inventory=new ArrayList<Item>();

    public Hero(){
        super(1);
        attack=new AttackWithWeapon();
    }

    protected void levelUp(){
        levelUpBehaviour.levelUp();
    }

    public void increaseHP(int value){HP=HP+value;};
    public void decreaseHP(int value){HP=HP-value;};

    public void increaseMP(int value){MP=MP+value;};
    public void decreaseMP(int value){MP=MP-value;};

    public void equip(){
        System.out.println("quip method ");
    };

    public void displayStatistics(){
        System.out.println("displays stats");
    }

    public void consumePotion(){
        System.out.println("will use position");
    }

    public void casting(Spell spell){
        System.out.println("will cast spell");
    }
}
