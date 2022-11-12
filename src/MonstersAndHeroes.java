import character.hero.Hero;
import character.hero.HeroFactory;
import character.hero.HerosEnum;
import world.TheWorldOfPlay;
import world.cells.ColorsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonstersAndHeroes {
    Scanner sc = new Scanner(System.in);
    TheWorldOfPlay theWorldOfPlay;
    List<Hero> party = new ArrayList<Hero>();

    public MonstersAndHeroes() {
        //displaying rules of the game
        rules();
        //asking for the size and creating the world of monsters and heroes.
        initiateWorld();
        //creating the party of heroes!
        creatingPlayers();
        //placing the party at their initial position
        theWorldOfPlay.initialPartyPosition();
        //displays the map of the created world
        theWorldOfPlay.displayWorld();
        //going to the space where the party is located
        theWorldOfPlay.at(party);
    }

    //displaying about the game and its rules
    void rules() {
        System.out.println("The monsters and heroes live in a fictional world. They do not get along and therefore fight each other.\n" +
                "Every time the heroes win, they gain experience and money. Heroes use the money to buy a variety of\n" +
                "items to aid them in their battles with the monsters. When they accumulate enough experience they\n" +
                "level up, which improves their skills. The goal of the game is for the heroes to defeat monsters and level\n" +
                "up indefinitely.");
        System.out.println("keyboard inputs!");
        System.out.println("• W/w: move up\n" +
                "• A/a: move left\n" +
                "• S/s: move down\n" +
                "• D/d: move right\n" +
                "• Q/q: quit game\n" +
                "• I/i: show information\n" +
                "• M/m: enter market" +
                "• map: display map"
        );
    }

    //creating the hero party
    void creatingPlayers() {
        int partySize;
        do {
            System.out.println("Enter the no of heroes in the party of heros between 1 and 3");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            partySize = sc.nextInt();
        } while (partySize <= 0 || partySize > 3);
        for (int i = 0; i < partySize; i++) {
            System.out.println("Selecting hero " + (i + 1));
            boolean selected = false;
            for (HerosEnum heroes : HerosEnum.values()) {
                System.out.println(heroes.getTextColor() + heroes + " ( " + heroes.getHeroType() + " )");
                System.out.println("MP=" + heroes.getMP() + ";  strength=" + heroes.getStrength() + ";  agility=" +
                        heroes.getAgility() + ";  dexterity=" +
                        heroes.getDexterity() + ";  gold=" +
                        heroes.getGold() + ";  experience=" +
                        heroes.getExperience() + ColorsClass.ANSI_WHITE + "\n");
            }
            do {
                System.out.println("Enter the name of the selected hero from the given heroes for hero " + (i + 1));
                String hero = sc.next();
                for (HerosEnum heroes : HerosEnum.values()) {
                    if (heroes.toString().equals(hero)) {
                        party.add(HeroFactory.getHero(heroes));
                        selected = true;
                        break;
                    }
                }
            } while (!selected);
        }
    }


    //asking for the size and creating the world of monsters and heroes.
    void initiateWorld() {
        int worldSize;
        do {
            System.out.println("Enter the prefered size of the world ( atleast 5 )");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            worldSize = sc.nextInt();
        } while (worldSize < 5);
        theWorldOfPlay = new TheWorldOfPlay(worldSize);
    }


}
