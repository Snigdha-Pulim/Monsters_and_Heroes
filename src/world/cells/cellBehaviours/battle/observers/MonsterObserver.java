package world.cells.cellBehaviours.battle.observers;

import character.hero.Hero;
import character.monster.Monster;

import java.util.List;

//Observer class for battle on monsters
public class MonsterObserver {
    public Monster monster;

    //sets the monsters to the class
    public MonsterObserver(Monster monster) {
        this.monster = monster;
    }

    //calls the attack method of a monster
    public String monsterAttack(Hero hero) {
        return monster.attack(hero);
    }

    //checks if the monster is dead
    public boolean checkIfDead() {
        if (monster.HP > 0) {
            return false;
        }
        return true;
    }

    //displays the monster!
    public void display() {
        monster.display();
    }

}
