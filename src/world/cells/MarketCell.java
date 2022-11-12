package world.cells;

import character.monster.Monster;
import world.cells.cellBehaviours.accessibilityBehaviour.Accessible;
import world.cells.cellBehaviours.movingBehaviour.CommonCellMovingBehaviour;
import world.cells.cellBehaviours.movingBehaviour.MarketCellMovingBehaviour;
import world.cells.cellBehaviours.whileAtBehaviour.WhileAtCommonCell;
import world.cells.cellBehaviours.whileAtBehaviour.WhileAtMarketCell;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketCell extends Cell {
    public Market market;

    public MarketCell() {
        //creating a market
        market = new Market();
        //initiating strategy pattern object
        accessibilityBahaviour = new Accessible(this);
        whileAtBehaviour = new WhileAtMarketCell(this);
        movingBehaviour = new MarketCellMovingBehaviour(this);
        //setting background color for market cell
        backgroundColor = ColorsClass.MarketCellBackground;

    }
}
