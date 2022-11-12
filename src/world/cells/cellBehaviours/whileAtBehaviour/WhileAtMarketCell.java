package world.cells.cellBehaviours.whileAtBehaviour;

import character.hero.Hero;
import keyboardInput.KeyboardInput;
import world.cells.InaccessibleCell;
import world.cells.MarketCell;

import java.util.List;
import java.util.Scanner;

//strategy pattern for market cell for while at behaviour
public class WhileAtMarketCell implements WhileAtBehaviour {
    MarketCell cell;
    Scanner sc = new Scanner(System.in);
    public WhileAtMarketCell(MarketCell cell) {
        this.cell = cell;
    }

    //while in a market cell/space
    @Override
    public String whileAt(List<Hero> party) {
        while (true) {
            System.out.println("you are currently on a market space");
            System.out.println("to enter the market press [m]");
            System.out.println("to move to an adjecent space, press one of the following [w,a,s,d]");
            System.out.println("to exit the game press [q]");
            System.out.println("to show information about the heroes press [i]");
            System.out.println("to get the map of the world press [map]");
            String input= sc.next();
            if(KeyboardInput.checkIfwasd(input)) return input;
            else if(KeyboardInput.checkIfGivenString(input,"q")) return input;
            else if(KeyboardInput.checkIfGivenString(input,"map")) return input;
            else if(KeyboardInput.checkIfGivenString(input,"m")){
                input=cell.market.whileAt(party);
                if(input!=null) return input;
            }
            else if(KeyboardInput.checkIfGivenString(input,"i")){
                for(Hero hero:party){
                    hero.display();
                }
            }
        }
    }
}
