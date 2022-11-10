package world;

import world.cells.Cell;
import world.cells.CommonCell;
import world.cells.InaccessibleCell;
import world.cells.MarketCell;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TheWorldOfPlay {
    int size;
    List<List<Cell>> world = new ArrayList<>();
    List<Cell> worldOfPlay = new ArrayList<Cell>();
    int partyAt;

    public TheWorldOfPlay(int size) {
        this.size = size;
        int total = size * size;
        int inaccessible_cells = (int) (20 * (this.size * this.size) / 100);
        int market_cells = (int) (30 * (this.size * this.size) / 100);
        int remaining = total - inaccessible_cells - market_cells;

        for (int i = 0; i < inaccessible_cells; i++)
            worldOfPlay.add(new InaccessibleCell());
        for (int i = 0; i < market_cells; i++)
            worldOfPlay.add(new MarketCell());
        for (int i = 0; i < remaining; i++)
            worldOfPlay.add(new CommonCell());

        shuffle();
    }

    public void shuffle() {
        world=new ArrayList<>();
        Collections.shuffle(worldOfPlay);
        for (int i = 0; i < size; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(worldOfPlay.get(i * size + j));
            }
            world.add(row);
        }
    }

    public void displayWorld() {
        System.out.println("\n");
        for (int i = 0; i < size; i++) {
            for (Cell cell : world.get(i)) {
                cell.display();
            }
            System.out.println();
            for (Cell cell : world.get(i)) {
                cell.display();
            }
            System.out.println("\n");
        }
    }

    public void initialPartyPosition(){
        boolean partyAdded=false;
        for (int i = 0; i < size; i++) {
            for (Cell cell : world.get(i)) {
                if(cell.accessibility()) {
                    partyAdded=true;
                    partyAt=i * size + world.get(i).indexOf(cell);
                    break;
                }
            }
            if(partyAdded) break;
        }

    }

}
