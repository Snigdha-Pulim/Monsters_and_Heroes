package world;

import character.hero.Hero;
import keyboardInput.KeyboardInput;
import position.Position;
import world.cells.Cell;
import world.cells.CommonCell;
import world.cells.InaccessibleCell;
import world.cells.MarketCell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TheWorldOfPlay {
    int size;
    List<List<Cell>> world = new ArrayList<>();
    List<Cell> worldOfPlay = new ArrayList<Cell>();
    Position partyAt;
    Scanner sc = new Scanner(System.in);

    public TheWorldOfPlay(int size) {
        //setting the size of the world!
        this.size = size;
        //calculating the total no of spaces in this world
        int total = size * size;
        //calculating the no of inaccessible spaces of this world
        int inaccessible_cells = (int) (20 * (this.size * this.size) / 100);
        //calculating the no of market spaces of this world
        int market_cells = (int) (30 * (this.size * this.size) / 100);
        //calculating the no of common spaces of this world
        int remaining = total - inaccessible_cells - market_cells;

        //creating and adding the required no of cells to the world
        for (int i = 0; i < inaccessible_cells; i++)
            worldOfPlay.add(new InaccessibleCell());
        for (int i = 0; i < market_cells; i++)
            worldOfPlay.add(new MarketCell());
        for (int i = 0; i < remaining; i++)
            worldOfPlay.add(new CommonCell());

        //shuffles the spaces of the world
        shuffle();
    }

    //shuffles the spaces of the world
    public void shuffle() {
        world = new ArrayList<>();
        Collections.shuffle(worldOfPlay);
        for (int i = 0; i < size; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(worldOfPlay.get(i * size + j));
            }
            world.add(row);
        }
    }

    //displays the world/map
    public void displayWorld() {
        System.out.println("\n");
        System.out.println("Color green represents the market spaces");
        System.out.println("Color blue represents the common spaces");
        System.out.println("Color white represents the inaccessible spaces");
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

    //setting the initial position of the party
    public void initialPartyPosition() {
        boolean partyAdded = false;
        for (int i = 0; i < size; i++) {
            for (Cell cell : world.get(i)) {
                if (cell.accessibility()) {
                    partyAdded = true;
                    partyAt = new Position(i, world.get(i).indexOf(cell));
                    break;
                }
            }
            if (partyAdded) break;
        }
    }

    //used when the player is trying to move in a directing that is not allowed
    public void moveNotPossible(List<Hero> party) {
        System.out.println("Sorry cant go that way");
        this.at(party);
    }

    //function used while at the particuler space in the world
    public void at(List<Hero> party) {
        //listing to returns from market and common cells
        String inputreturned = world.get(partyAt.x).get(partyAt.y).whileAt(party);
        //movement input of the game
        if (KeyboardInput.checkIfwasd(inputreturned)) {
            int iIndex;
            int jIndex;
            if (inputreturned.equalsIgnoreCase("w")) {
                iIndex = partyAt.x - 1;
                jIndex = partyAt.y;
            } else if (inputreturned.equalsIgnoreCase("a")) {
                iIndex = partyAt.x;
                jIndex = partyAt.y - 1;
            } else if (inputreturned.equalsIgnoreCase("s")) {
                iIndex = partyAt.x + 1;
                jIndex = partyAt.y;
            } else {
                iIndex = partyAt.x;
                jIndex = partyAt.y + 1;
            }
            //check if the move is possible
            if (iIndex < 0 || jIndex < 0 || iIndex >= size || jIndex >= size) {
                moveNotPossible(party);
            }
            //if possible, will move there
            else {
                moveTo(iIndex, jIndex, party);
            }
        }
        //checking for quit options
        else if (KeyboardInput.checkIfGivenString(inputreturned, "q")) {
            System.out.println();
            System.out.println("game over");
            System.out.println(" --GG--");
        }
        //checking if map is required
        else if (KeyboardInput.checkIfGivenString(inputreturned, "map")) {
            displayWorld();
            at(party);
        }
    }

    //updates the position of the party to the selected space
    public void moveTo(int i, int j, List<Hero> party) {
        if (world.get(i).get(j).accessibility()) {
            world.get(partyAt.x).get(partyAt.y).partyMoving();
            partyAt.changePosition(i, j);
            displayWorld();
            at(party);
        } else moveNotPossible(party);
    }


}
