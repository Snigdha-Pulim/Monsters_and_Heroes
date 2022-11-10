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
    List<Hero> party=new ArrayList<Hero>();
    public MonstersAndHeroes(){
        rules();
        initiateWorld();
        creatingPlayers();
        theWorldOfPlay.initialPartyPosition();
        theWorldOfPlay.displayWorld();
    }
    void rules(){
        System.out.println("will print rules here");
    }

    void creatingPlayers(){
        int partySize;
        do {
            System.out.println("Enter the no of heroes in the party of heros");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            partySize = sc.nextInt();
        } while (partySize <= 0);
        for(int i=0;i<partySize;i++){
            System.out.println("Selecting hero "+(i+1));
            boolean selected=false;
            for(HerosEnum heroes : HerosEnum.values()){
                System.out.println(heroes.getTextColor()+heroes+" ( "+heroes.getHeroType()+" )"+ ColorsClass.ANSI_WHITE);
            }
            do {
                System.out.println("Enter the name of the selected hero from the given heroes for hero "+(i+1));
                String hero = sc.next();
                for(HerosEnum heroes : HerosEnum.values()){
                    if(heroes.toString().equals(hero)){
                        party.add(HeroFactory.getHero(heroes));
                        selected=true;
                        break;
                    }
                }
            } while (!selected);
        }
    }

    void initiateWorld(){
        int worldSize;
        do {
            System.out.println("Enter the prefered size of the world ( atleast 5 )");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            worldSize = sc.nextInt();
        } while (worldSize < 5);
        theWorldOfPlay=new TheWorldOfPlay(worldSize);
    }


}
