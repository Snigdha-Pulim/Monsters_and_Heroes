package world.cells;

import world.cells.accessibilityBehaviour.Inaccessible;

public class InaccessibleCell extends Cell {
    public InaccessibleCell(){
        accessibilityBahaviour=new Inaccessible();
        backgroundColor= ColorsClass.InaccessibleCellBackground;
    }
}
