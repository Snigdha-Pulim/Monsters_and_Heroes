package world.cells.cellBehaviours.movingBehaviour;

import world.cells.InaccessibleCell;
import world.cells.MarketCell;

//strategy pattern class for a market cell for Moving behaviour
public class MarketCellMovingBehaviour implements MovingBehaviour{
    MarketCell cell;
    public MarketCellMovingBehaviour(MarketCell cell){
        this.cell=cell;
    }
    @Override
    public void partyMoving() {
        cell.party=false;
    }
}
