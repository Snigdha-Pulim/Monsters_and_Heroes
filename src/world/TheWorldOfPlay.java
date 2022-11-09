package world;

import world.cells.Cell;
import world.cells.CommonCell;
import world.cells.InaccessibleCell;
import world.cells.MarketCell;

import java.util.ArrayList;
import java.util.List;

public class TheWorldOfPlay {
    int size;
    List<Cell> world = new ArrayList<Cell>();

    public TheWorldOfPlay(int size) {
        this.size = size;
        int total = size * size;
        size = size * size;
        int inaccessible_cells = (int) 20 / total;
        size = size - inaccessible_cells;
        addingInaccessibleCells(inaccessible_cells);
        int market_cells = (int) 30 / total;
        size = size - market_cells;
        addingMarketCells(market_cells);
        addingCommonCells(size);
    }

    void addingInaccessibleCells(int number) {
        for (int i = 0; i < number; i++) {
            world.add(new InaccessibleCell());
        }
    }

    void addingMarketCells(int number) {
        for (int i = 0; i < number; i++) {
            world.add(new MarketCell());
        }
    }

    void addingCommonCells(int number) {
        for (int i = 0; i < number; i++) {
            world.add(new CommonCell());
        }
    }
}
