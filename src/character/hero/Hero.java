package character.hero;

import character.Character;
import character.behavior.attack.AttackWithWeapon;
import character.behavior.display.HeroDisplayBehavior;
import character.hero.levelUpBehaviour.LevelUpBehaviour;
import item.Item;
import item.armory.Armory;
import item.potion.Potion;
import item.spell.Spell;
import item.weaponry.Weaponry;
import keyboardInput.KeyboardInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Hero extends Character {
    //attributes of a hero
    public int strength;
    public int dexterity;
    public int agility;
    public int gold;
    public int experience;
    public int MP;
    //strategy pattern for different types of heroes
    public LevelUpBehaviour levelUpBehaviour;
    public List<Item> currentAttackItems = new ArrayList<>();
    public Armory currentlySelectedArmory = null;
    Scanner sc = new Scanner(System.in);

    public List<Item> inventory = new ArrayList<Item>();

    public Hero() {
        super(1);
        attack = new AttackWithWeapon(this);
        display = new HeroDisplayBehavior(this);
    }

    //leve up behaviour
    public void levelUp() {
        experience=experience-(level*10);
        level=level+1;
        HP=level*100;
        MP=MP*11/10;
        levelUpBehaviour.levelUp();
    }

    //equipping weapons or other items
    public void equip() {
        System.out.println(name + ":");
        //to consume potions
        consumingPotions();
        System.out.println("returned from ");
        if (!checkAttactIteams()) {
            currentAttackItems = new ArrayList<>();
            //to equip spells
            attackWithSpells();
            if (currentAttackItems.isEmpty()) {
                //tp equip weapons
                addingWeapons();
            }
        }

        //equipping armors
        if (!checkArmorIteam()) {
            currentlySelectedArmory = null;
            addingArmor();
        }

    }

    //consuming potions
    private void consumingPotions() {
        //checking for potions in the inventory
        List<Potion> potions = new ArrayList<>();
        for (Item item : inventory)
            if (item.type().equals("Potion"))
                potions.add((Potion) item);

        //if there exist at least 1 potion in the inventory
        if (!potions.isEmpty()) {
            while (true) {
                System.out.println("Here are potions you own");
                for (Potion potion : potions) {
                    System.out.println();
                    System.out.print((potions.indexOf(potion) + 1) + ") ");
                    potion.displayItem();
                }
                System.out.println();
                System.out.println("Do you want to consume a potion?");
                System.out.println("if yes press [y]");
                System.out.println("else press anything else");
                String input = sc.next();
                if (KeyboardInput.checkIfGivenString(input, "q")) {
                    exit(0);
                }
                if (KeyboardInput.checkIfGivenString(input, "y")) {
                    int potionIndex;
                    do {
                        System.out.println("Enter the index of the potion you want to use");
                        while (!sc.hasNextInt()) {
                            System.out.println("That's not a number!");
                            sc.next();
                        }
                        potionIndex = sc.nextInt();
                    } while (potionIndex <= 0 || potionIndex > potions.size());
                    potions.get(potionIndex - 1).effect(this);
                    removeConsumable(potions.get(potionIndex - 1));
                    potions.remove(potions.get(potionIndex - 1));
                } else break;
            }
        }
    }

    //checking if the hero wants to continue with existing weapons
    private boolean checkAttactIteams() {
        if (!currentAttackItems.isEmpty()) {
            for (Item item : currentAttackItems)
                item.displayItem();
            System.out.println("Do you want to continue with your current attack item(s)?");
            System.out.println("if yes press [y]");
            System.out.println("else press anything else");
            String input = sc.next();
            if (KeyboardInput.checkIfGivenString(input, "q")) {
                exit(0);
            } else if (KeyboardInput.checkIfGivenString(input, "y")) {
                return true;
            }
        }
        return false;
    }

    //adding spells to attack with
    private void attackWithSpells() {
        List<Spell> spells = new ArrayList<>();
        for (Item item : inventory)
            if (item.type().equals("Spell"))
                spells.add((Spell) item);
        if (!spells.isEmpty()) {
            System.out.println("Here are spells you own");
            for (Spell spell : spells) {
                System.out.println();
                System.out.print((spells.indexOf(spell) + 1) + ") ");
                spell.displayItem();
            }
            System.out.println();
            System.out.println("Do you want to use a spell to attack? " +
                    "If you use a spell, you cannot use any weapons");
            System.out.println("if yes press [y]");
            System.out.println("else press anything else");
            String input = sc.next();
            if (KeyboardInput.checkIfGivenString(input, "q")) {
                exit(0);
            }
            if (KeyboardInput.checkIfGivenString(input, "y")) {
                int spellIndex;
                do {
                    System.out.println("Enter the index of the Spell you want to use");
                    while (!sc.hasNextInt()) {
                        System.out.println("That's not a number!");
                        sc.next();
                    }
                    spellIndex = sc.nextInt();
                } while (spellIndex <= 0 || spellIndex > spells.size());
                if (!(spells.get(spellIndex - 1).mana_cost > MP)) {
                    currentAttackItems.add(spells.get(spellIndex - 1));
                    removeConsumable(spells.get(spellIndex - 1));
                    spells.remove(spells.get(spellIndex - 1));
                } else System.out.println("you do not have enough Mana points for this spell!");
            }
        }
    }

    //checking if the hero wants to continue with the existing armor
    private boolean checkArmorIteam() {
        if (!(currentlySelectedArmory == null)) {
            currentlySelectedArmory.displayItem();
            System.out.println("Do you want to continue with your current armour item?");
            System.out.println("if yes press [y]");
            System.out.println("else press anything else");
            String input = sc.next();
            if (KeyboardInput.checkIfGivenString(input, "q")) {
                exit(0);
            } else if (KeyboardInput.checkIfGivenString(input, "y")) {
                return true;
            }
        }
        return false;
    }

    //adding weapons to battle with
    private void addingWeapons() {
        List<Weaponry> weapons = new ArrayList<>();
        for (Item item : inventory)
            if (item.type().equals("Weaponry"))
                weapons.add((Weaponry) item);
        int freeHands = 2;
        while (freeHands > 0 && !weapons.isEmpty()) {
            System.out.println("Here are weapons you own");
            for (Weaponry weapon : weapons) {
                System.out.println();
                System.out.print((weapons.indexOf(weapon) + 1) + ") ");
                weapon.displayItem();
            }
            System.out.println();
            System.out.println("Do you want to use a weapon to attack? ");
            System.out.println("if yes press [y]");
            System.out.println("else press anything else");
            String input = sc.next();
            if (KeyboardInput.checkIfGivenString(input, "q")) {
                exit(0);
            }
            if (KeyboardInput.checkIfGivenString(input, "y")) {
                int weaponIndex;
                do {
                    System.out.println("Enter the index of the weapon you want to use");
                    while (!sc.hasNextInt()) {
                        System.out.println("That's not a number!");
                        sc.next();
                    }
                    weaponIndex = sc.nextInt();
                } while (weaponIndex <= 0 || weaponIndex > weapons.size());
                if (freeHands >= weapons.get(weaponIndex - 1).required_hands) {
                    currentAttackItems.add(weapons.get(weaponIndex - 1));
                    freeHands = freeHands - weapons.get(weaponIndex - 1).required_hands;
                    weapons.remove(weapons.get(weaponIndex - 1));
                }
            } else break;
        }
    }

    //adding armor to battle with
    private void addingArmor() {
        List<Armory> armories = new ArrayList<>();
        for (Item item : inventory)
            if (item.type().equals("Armory"))
                armories.add((Armory) item);
        if (!armories.isEmpty()) {
            System.out.println("Here are armories you own");
            for (Armory armor : armories) {
                System.out.println();
                System.out.print((armories.indexOf(armor) + 1) + ") ");
                armor.displayItem();
            }
            System.out.println();
            System.out.println("Do you want to use a armories to defend?");
            System.out.println("if yes press [y]");
            System.out.println("else press anything else");
            String input = sc.next();
            if (KeyboardInput.checkIfGivenString(input, "q")) {
                exit(0);
            }
            if (KeyboardInput.checkIfGivenString(input, "y")) {
                int armoriesIndex;
                do {
                    System.out.println("Enter the index of the armor you want to use");
                    while (!sc.hasNextInt()) {
                        System.out.println("That's not a number!");
                        sc.next();
                    }
                    armoriesIndex = sc.nextInt();
                } while (armoriesIndex <= 0 || armoriesIndex > armories.size());
                currentlySelectedArmory = armories.get(armoriesIndex - 1);
                armories.remove(armories.get(armoriesIndex - 1));
            }
        }
    }

    //removes one time use items like potions and spells
    public void removeConsumable(Item item) {
        inventory.remove(item);
    }

    public int getGold() {
        return gold;
    }

    //adding items from the market
    public void addItem(Item item) {
        inventory.add(item);
        gold = gold - item.cost;
    }

    //selling items to the market
    public void sellItem(Item item) {
        inventory.remove(item);
        gold = gold + (item.cost / 2);
    }

    //displays the stats and other attributes of a hero
    public void displayInventory() {
        for (Item inventoryItem : inventory) {
            System.out.print((inventory.indexOf(inventoryItem) + 1) + ") ");
            inventoryItem.displayItem();
            System.out.println();
        }
    }
}
