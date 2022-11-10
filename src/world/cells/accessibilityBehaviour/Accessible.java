package world.cells.accessibilityBehaviour;

import world.cells.Cell;

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
