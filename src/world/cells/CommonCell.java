package world.cells;

import character.hero.Hero;
import character.monster.Monster;
import character.monster.MonstersFactory;
import item.Item;
import item.armory.Armory;
import item.potion.Potion;
import item.spell.Spell;
import item.weaponry.Weaponry;
import keyboardInput.KeyboardInput;
import position.Position;
import world.cells.cellBehaviours.accessibilityBehaviour.Accessible;
import world.cells.cellBehaviours.movingBehaviour.CommonCellMovingBehaviour;
import world.cells.cellBehaviours.whileAtBehaviour.WhileAtCommonCell;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonCell extends Cell {
    List<Monster> monsterList = new ArrayList<Monster>();
    Scanner sc = new Scanner(System.in);
    public boolean battledChecked = false;

    public CommonCell() {
        //initiating strategy pattern object
        accessibilityBahaviour = new Accessible(this);
        whileAtBehaviour = new WhileAtCommonCell(this);
        movingBehaviour = new CommonCellMovingBehaviour(this);

        //setting the background color of the commoncell
        backgroundColor = ColorsClass.CommonCellBackground;
    }
    public void battleInitiated(){
        battledChecked = true;
    }

}
