package world.cells.cellBehaviours.whileAtBehaviour;

import character.hero.Hero;
import keyboardInput.KeyboardInput;
import world.cells.cellBehaviours.battle.Battle;
import world.cells.CommonCell;

import java.util.List;
import java.util.Scanner;

//strategy pattern class for commoncell for while at behaviour
public class WhileAtCommonCell implements WhileAtBehaviour {
    CommonCell cell;

    public WhileAtCommonCell(CommonCell cell) {
        this.cell = cell;
    }

    Scanner sc = new Scanner(System.in);

    //while at common cell/space
    @Override
    public String whileAt(List<Hero> party) {
        System.out.println("you are currently on a commonspace space");
        if (!cell.battledChecked) {
            cell.battleInitiated();
            System.out.println("Rolling an unbiased dice");
            System.out.println("if the number is 1, 2 or 3; monsters will be created");
            System.out.println("Rolling.....");
            int dice = (int) (Math.random() * 6) + 1;
            System.out.println("The number on the dice is " + dice);
            if (dice <= 3) {
                System.out.println("prepare for battle!");
                Battle battle = new Battle();
                battle.createBattle(party);
            }
            ;
        }
        while (true) {
            System.out.println("to move to an adjecent space, press one of the following [w,a,s,d]");
            System.out.println("to exit the game press [q]");
            System.out.println("to show information about the heroes press [i]");
            System.out.println("to get the map of the world press [map]");
            String input = sc.next();
            if (KeyboardInput.checkIfwasd(input)) return input;
            else if (KeyboardInput.checkIfGivenString(input, "q")) return input;
            else if(KeyboardInput.checkIfGivenString(input,"map")) return input;
            else if (KeyboardInput.checkIfGivenString(input, "i")) {
                for (Hero hero : party) {
                    hero.display();
                }
            }
            ;
        }
    }
}
