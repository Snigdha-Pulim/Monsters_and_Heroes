package world.cells;

import world.cells.cellBehaviours.accessibilityBehaviour.Accessible;
import world.cells.cellBehaviours.accessibilityBehaviour.Inaccessible;
import world.cells.cellBehaviours.movingBehaviour.InaccessibleCellMovingBehaviour;
import world.cells.cellBehaviours.movingBehaviour.MarketCellMovingBehaviour;
import world.cells.cellBehaviours.whileAtBehaviour.WhileAtInaccessible;
import world.cells.cellBehaviours.whileAtBehaviour.WhileAtMarketCell;

public class InaccessibleCell extends Cell {
    public InaccessibleCell(){
        //initiating strategy pattern object
        accessibilityBahaviour=new Inaccessible();
        whileAtBehaviour=new WhileAtInaccessible();
        movingBehaviour=new InaccessibleCellMovingBehaviour();

        //setting the background color of the InaccessibleCell
        backgroundColor= ColorsClass.InaccessibleCellBackground;
    }

}

