package world.cells;

import world.cells.accessibilityBehaviour.Accessible;

public class CommonCell extends Cell{
    public CommonCell(){
        accessibilityBahaviour=new Accessible(this);
        backgroundColor= ColorsClass.CommonCellBackground;
    }
}
