package world.cells.cellBehaviours.battle.observers;

import character.hero.Hero;
import character.monster.Monster;

//Observer class for battle on heroes
public class HeroObserver {
    public Hero hero;

    public HeroObserver(Hero hero) {
        this.hero = hero;
    }

    //calls the hero's equip method
    public void heroEquip() {
        hero.equip();
    }

    //calls the hero's attack method
    public String heroAttack(Monster monster) {
        return hero.attack(monster);
    }

    //check if the hero has fainted
    public boolean checkIfConsious() {
        if(hero.HP>0){
            return false;
        }
        return true;
    }

    //update method after the completion of a battle for hero who have not fainted
    public void battleOverUpdateDidNotFaint(int noOfMonstersInTheBattle,int monsterLevel) {
        hero.experience=hero.experience+noOfMonstersInTheBattle*2*monsterLevel;
        hero.gold=hero.gold+(monsterLevel*100);
        if(hero.experience>=hero.level*10){
            hero.levelUp();
        }
    }

    //update method after the completion of a battle for hero who have fainted
    public void battleOverUpdateFainted() {
        hero.HP=50;
    }

    //after every round of the battle, updates Hp and MP of the hero
    public void roundOverUpdate(){
        hero.HP=hero.HP*110/100;
        hero.MP=hero.MP*110/100;
    }
}
