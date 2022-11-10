package world.cells;

import world.cells.accessibilityBehaviour.AccessibilityBahaviour;

public class Cell {
    String backgroundColor;
    public boolean party=false;
    AccessibilityBahaviour accessibilityBahaviour;

    public void display(){
        System.out.print(ColorsClass.ANSI_BLACK_BACKGROUND+" ");
        if(party) System.out.print(backgroundColor+"  "+ColorsClass.ANSI_YELLOW_BACKGROUND+"___"+backgroundColor+"  "+ColorsClass.ANSI_WHITE);
        else System.out.print(backgroundColor+"       ");
        System.out.print(ColorsClass.ANSI_BLACK_BACKGROUND+" ");
    }

    public boolean accessibility(){
        return accessibilityBahaviour.accessibility();
    }

}
