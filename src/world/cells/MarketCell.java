package world.cells;

import world.cells.accessibilityBehaviour.Accessible;

public class MarketCell extends Cell {
    public MarketCell(){
        accessibilityBahaviour=new Accessible(this);
        backgroundColor= ColorsClass.MarketCellBackground;
    }
}
