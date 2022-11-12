package world.cells.cellBehaviours.accessibilityBehaviour;

import world.cells.Cell;
//strategy pattern class for market and common spaces for accessibility behaviour
public class Accessible implements AccessibilityBahaviour{
    Cell cell;
    public Accessible(Cell cell){
        this.cell=cell;
    }

    @Override
    public boolean accessibility() {
        cell.party=true;
        return true;
    }
}
