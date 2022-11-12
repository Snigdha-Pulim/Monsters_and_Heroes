package world.cells.cellBehaviours.battle;

import character.hero.Hero;
import character.monster.Monster;
import world.cells.cellBehaviours.battle.observers.HeroObserver;
import world.cells.cellBehaviours.battle.observers.MonsterObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//observer pattern on heroes and monsters in a battle
public class BattleSubject {
    List<HeroObserver> heroesinBattle = new ArrayList<>();
    List<HeroObserver> allHeroes = new ArrayList<>();
    List<MonsterObserver> monstersinBattle = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    //to register a hero
    void registerAllHeroes(HeroObserver observer) {
        allHeroes.add(observer);
        heroesinBattle.add(observer);
    }

    //to un register a hero
    void unRegisterHeroes(HeroObserver observer) {
        heroesinBattle.remove(observer);
    }

    //to register monsters
    void registerAllMonsters(MonsterObserver observer) {
        monstersinBattle.add(observer);
    }

    //to un register monsters
    void unRegisterAllMonsters(MonsterObserver observer) {
        monstersinBattle.remove(observer);
    }

    //calling the equip method on all heroes in the battle
    public void heroEquip() {
        for (HeroObserver hero : heroesinBattle) {
            hero.heroEquip();
        }
    }

    //calling the attack method on all heroes in the battle
    public String heroAttack() {
        String resultingString = "";
        for (HeroObserver hero : heroesinBattle) {
            for (MonsterObserver monsterObserver : monstersinBattle) {
                System.out.print((monstersinBattle.indexOf(monsterObserver) + 1) + ") ");
                monsterObserver.monster.display();
            }
            int monstersIndex;
            do {
                System.out.println(hero.hero.name + " enter the index of the monster you want to fight");
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a number!");
                    sc.next();
                }
                monstersIndex = sc.nextInt();
            } while (monstersIndex <= 0 || monstersIndex > monstersinBattle.size());
            resultingString = resultingString + hero.heroAttack(monstersinBattle.get(monstersIndex - 1).monster) + "\n";
        }
        return resultingString;
    }

    //check if any heroes have fainted and un registering them accordingly from the battle
    public void checkIfConsious() {
        List<HeroObserver> tempList = new ArrayList<>();
        for (HeroObserver hero : heroesinBattle) {
            if (hero.checkIfConsious()) {
                System.out.println(hero.hero.name + " fainted!");
                tempList.add(hero);
            }
        }
        for (HeroObserver hero : tempList)
            unRegisterHeroes(hero);
    }

    //check if any monsters have died and un registering them accordingly from the battle
    public void checkIfMonsterIsDead() {
        List<MonsterObserver> tempList = new ArrayList<>();
        for (MonsterObserver monster : monstersinBattle) {
            if (monster.checkIfDead()) {
                System.out.println(monster.monster.name + " died!");
                tempList.add(monster);
            }
        }
        for (MonsterObserver monster : tempList)
            unRegisterAllMonsters(monster);
    }

    //updating heroes on battle completing
    public void battleOverUpdate(int monsterLevel) {
        for (HeroObserver hero : allHeroes) {
            if (heroesinBattle.contains(hero))
                hero.battleOverUpdateDidNotFaint(allHeroes.size(), monsterLevel);
            else hero.battleOverUpdateFainted();
        }
    }

    //updating hero HP and MP after each round
    public void roundOverUpdate() {
        for (HeroObserver hero : allHeroes) {
            hero.roundOverUpdate();
        }
    }

    //displaying monsters in the game
    public void monsterDisplay() {
        for (MonsterObserver monster : monstersinBattle) {
            System.out.print(monstersinBattle.indexOf(monster) + ") ");
            monster.display();
        }
    }

    //checking if all the monsters have died
    public boolean checkIfMonstersAreEmpty() {
        if (monstersinBattle.isEmpty()) return true;
        return false;
    }

    //checking if all the heroes have fainted
    public boolean checkIfHeroesAreEmpty() {
        if (heroesinBattle.isEmpty()) return true;
        return false;
    }

    //invokes monster attack method
    public String monsterAttack() {
        String resultingString = "";
        for (MonsterObserver monster : monstersinBattle) {
            int indexOfHeroToAttack = (int) (Math.random() * heroesinBattle.size()) + 1;
            resultingString = resultingString + monster.monsterAttack(heroesinBattle.get(indexOfHeroToAttack - 1).hero) + "\n";
        }
        return resultingString;
    }

    //invokes heroes display method
    public void herosDisplay() {
        for (HeroObserver hero : heroesinBattle) {
            hero.hero.display();
        }
    }

}
