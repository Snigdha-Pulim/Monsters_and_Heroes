import world.cells.ColorsClass;

public class Main {
    public static void main(String[] args) {
        //setting background color to black
        System.out.println(ColorsClass.ANSI_BLACK_BACKGROUND);
        //setting text color to white
        System.out.println(ColorsClass.ANSI_WHITE);
        //initiating Monsters and Heroes game
        MonstersAndHeroes monstersAndHeroes=new MonstersAndHeroes();
    }
}