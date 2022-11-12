package world.cells.cellBehaviours.battle;

import character.hero.Hero;
import character.monster.Monster;
import character.monster.MonstersFactory;
import keyboardInput.KeyboardInput;
import world.cells.cellBehaviours.battle.observers.HeroObserver;
import world.cells.cellBehaviours.battle.observers.MonsterObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Battle {
    //level of the monsters in the battle
    int monsterLevel;

    //list of monsters creating in the battle
    List<Monster> monsterList = new ArrayList<Monster>();
    //subject of the observer pattern of the battle
    BattleSubject battleSubject = new BattleSubject();
    //battle moves string
    String battleString="";
    Scanner sc = new Scanner(System.in);

    //creating a battle
    public void createBattle(List<Hero> party) {
        System.out.println("heroes:");
        int level = 0;
        //checking for the right level for monsters
        for (Hero hero : party)
            if (hero.level > level)
                level = hero.level;
        //creating monsters
        for (Hero hero : party) {
            monsterLevel=level;
            monsterList.add(MonstersFactory.getMonster(level));
            hero.display();
            //adding the list heroes to the subject class of the observer pattern
            battleSubject.registerAllHeroes(new HeroObserver(hero));
        }
        System.out.println();
        System.out.println("Monsters");
        //displaying monsters
        for (Monster monster : monsterList) {
            monster.display();
            //adding the list of monsters to the subject class
            battleSubject.registerAllMonsters(new MonsterObserver(monster));
        }
        battle(party);
    }

    //battle takes place here!
    public void battle(List<Hero> party) {
        int round = 1;
        boolean battleEnd = false;
        //the while loop goes on till eight all monsters loose or all  heroes loose
        while (!battleEnd) {
            System.out.println("Round ("+round+"):");
            System.out.println("To quit press [q]");
            System.out.println("else press anything else");
            String input=sc.next();
            //for quitting
            if(KeyboardInput.checkIfGivenString(input,"q")) exit(0);
            //checking if all the monsters have dies
            if (battleSubject.checkIfMonstersAreEmpty()) battleEnd = true;
            //checking if all the heroes have fainted
            else if (battleSubject.checkIfHeroesAreEmpty()) battleEnd = true;
            //invokes equip method of all heroes
            battleSubject.heroEquip();
            //all heroes attack
            battleString=battleString+battleSubject.heroAttack();
            //checking if any monsters died
            battleSubject.checkIfMonsterIsDead();
            //all monsters attack
            battleString=battleString+battleSubject.monsterAttack();
            //displays battle text
            displayBattleText();
            //checks if any heroes have fainted
            battleSubject.checkIfConsious();
            //updates the HP and MP of every hero still in the battle
            battleSubject.roundOverUpdate();
            //displays heroes
            battleSubject.herosDisplay();
            round=round+1;
        }
        //if all the heroes loose, the game will end
        if (battleSubject.checkIfHeroesAreEmpty()) {
            System.out.println("game over, you lost!");
            exit(0);
        }
        //updating the stats of all heroes
        battleSubject.battleOverUpdate(monsterLevel);
    }
    //displays the battle text
    public void displayBattleText(){
        System.out.println(battleString);
    }
}
