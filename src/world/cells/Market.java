package world.cells;

import character.hero.Hero;
import item.Item;
import item.armory.ArmorsEnum;
import item.armory.ArmoryFactory;
import item.potion.PotionFactory;
import item.potion.PotionsEnum;
import item.spell.SpellFactory;
import item.spell.SpellsEnum;
import item.weaponry.WeaponryFactory;
import item.weaponry.WeaponsEnum;
import keyboardInput.KeyboardInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {
    List<Item> items = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Market() {
        //adding one of each item to the new market!
        addingItemsToTheMarket();
    }

    //adding items to the market
    void addingItemsToTheMarket() {
        for (ArmorsEnum armorsEnum : ArmorsEnum.values())
            items.add(ArmoryFactory.getArmory(armorsEnum));

        for (PotionsEnum potionsEnum : PotionsEnum.values())
            items.add(PotionFactory.getPotion(potionsEnum));

        for (SpellsEnum spellsEnum : SpellsEnum.values())
            items.add(SpellFactory.getSpell(spellsEnum));

        for (WeaponsEnum weaponsEnum : WeaponsEnum.values())
            items.add(WeaponryFactory.getWeaponry(weaponsEnum));
    }

    //displaying market iteam
    public void displayItems() {
        System.out.println();
        for (Item item : items) {
            System.out.print((items.indexOf(item) + 1) + ") ");
            item.displayItem();
            System.out.println();
        }
        System.out.println();
    }

    //whilte in the market. to buy/sell iteams menu
    public String whileAt(List<Hero> party) {
        boolean out = false;
        System.out.println("The market contains the following items!");
        displayItems();
        System.out.println("To leave the market press [o]");
        System.out.println("to quit press [q]");
        for (Hero hero : party) {
            boolean repeat = true;
            while (repeat) {
                System.out.println("to show information of " + hero.name + " press [i]");
                System.out.println(hero.name + " Would you like to buy/sell any item?");
                System.out.println("press 'b' to buy an item");
                System.out.println("press 's' to sell any of your items");
                System.out.println("if not interested, press anything else");
                String input = sc.next();
                if (KeyboardInput.checkIfGivenString(input, "o")) {
                    repeat = false;
                    out = true;
                    break;
                } else if (KeyboardInput.checkIfGivenString(input, "q")) return "q";
                else if (KeyboardInput.checkIfGivenString(input, "b")) {
                    int itemIndex;
                    do {
                        System.out.println("Enter the index of the item to buy it!");
                        while (!sc.hasNextInt()) {
                            System.out.println("That's not a number!");
                            sc.next();
                        }
                        itemIndex = sc.nextInt();
                    } while (itemIndex <= 0 || itemIndex > items.size());
                    buyItem(hero, items.get(itemIndex - 1));
                } else if (KeyboardInput.checkIfGivenString(input, "s")) {
                    sellItem(hero);
                } else if (KeyboardInput.checkIfGivenString(input, "i")) {
                    hero.display();
                    break;
                } else {
                    repeat = false;
                    break;
                }
                System.out.println("do you want to continue to buy/sell anymore item?");
                System.out.println("if yes press [y]");
                System.out.println("else press [n]");
                input = sc.next();
                if (!KeyboardInput.checkIfGivenString(input, "y")) repeat = false;
                else if (KeyboardInput.checkIfGivenString(input, "q")) return "q";
                else displayItems();
            }
            if (out) return null;
        }
        return null;
    }

    //buying items
    public boolean buyItem(Hero hero, Item item) {
        if (hero.getGold() >= item.cost && hero.level >= item.required_level) {
            hero.addItem(item);
            items.remove(item);
            hero.display();
            return true;
        }
        if (hero.level < item.required_level)
            System.out.println("sorry you cannot buy this item, " + hero.name + " does not have enough experience");
        else if (hero.getGold() < item.cost)
            System.out.println("sorry you cannot buy this item, " + hero.name + " does not have enough gold");
        return false;
    }

    //selling items
    public boolean sellItem(Hero hero) {
        if (!hero.inventory.isEmpty()) {
            hero.displayInventory();
            int itemIndex;
            do {
                System.out.println("Enter the index of the item to sell!");
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a number!");
                    sc.next();
                }
                itemIndex = sc.nextInt();
            } while (itemIndex <= 0 || itemIndex > hero.inventory.size());
            hero.sellItem(hero.inventory.get(itemIndex - 1));
            items.add(hero.inventory.get(itemIndex - 1));
            return true;
        } else {
            System.out.println("inventory of " + hero.name + " is empty");
            return false;
        }
    }


}
