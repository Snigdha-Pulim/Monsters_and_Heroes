package world.cells.cellBehaviours.movingBehaviour;

import world.cells.CommonCell;

//strategy pattern class for a common cell for Moving behaviour
public class CommonCellMovingBehaviour implements MovingBehaviour{
    CommonCell cell;
    public CommonCellMovingBehaviour(CommonCell cell){
        this.cell=cell;
    }
    @Override
    public void partyMoving() {
        cell.party=false;
        cell.battledChecked=false;
    }
}
