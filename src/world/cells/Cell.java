package world.cells;

import character.hero.Hero;
import world.cells.cellBehaviours.accessibilityBehaviour.AccessibilityBahaviour;
import world.cells.cellBehaviours.movingBehaviour.MovingBehaviour;
import world.cells.cellBehaviours.whileAtBehaviour.WhileAtBehaviour;

import java.util.List;

public class Cell {
    String backgroundColor;
    public boolean party=false;

    //strategy pattern on the accesssibility behaviour because diffect spaces of the world have different behaviours
    AccessibilityBahaviour accessibilityBahaviour;

    //strategy pattern object for when the party of heros are in a cell
    WhileAtBehaviour whileAtBehaviour;

    //strategy pattern movingBehaviour object
    MovingBehaviour movingBehaviour;

    //displays each space of the world
    public void display(){
        System.out.print(ColorsClass.ANSI_BLACK_BACKGROUND+" ");
        if(party) System.out.print(backgroundColor+"  "+ColorsClass.ANSI_BLACK_BACKGROUND+"__"+backgroundColor+"  "+ColorsClass.ANSI_WHITE);
        else System.out.print(backgroundColor+"      ");
        System.out.print(ColorsClass.ANSI_BLACK_BACKGROUND+" ");
    }

    //strategy pattern on accessibility of the space
    public boolean accessibility(){
        return accessibilityBahaviour.accessibility();
    }

    //strategy pattern while at the space
    public String whileAt(List<Hero> party){
        return whileAtBehaviour.whileAt(party);
    }

    //strategy pattern on party Movement
    public void partyMoving(){
        movingBehaviour.partyMoving();
    }

}
