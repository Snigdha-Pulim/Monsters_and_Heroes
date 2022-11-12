package character.hero;

//hero enum
public enum HerosEnum {
    Amaryllis_Astra("Paladins", 500, 500, 500, 500, 2500, 5),
    Caliber_Heist("Paladins", 400, 400, 400, 400, 2500, 8),
    Garl_Glittergold("Paladins", 100, 600, 500, 400, 2500, 5),
    Parzival("Paladins", 300, 750, 650, 700, 2500, 7),
    Sehanine_Moonbow("Paladins", 300, 750, 700, 700, 2500, 7),
    Skoraeus_Stonebones("Paladins", 250, 650, 600, 350, 2500, 4),
    Kalabar("Sorcerers", 800, 850, 400, 600, 2500, 6),
    Reign_Havoc("Sorcerers", 800, 800, 800, 800, 2500, 8),
    Reverie_Ashels("Sorcerers", 900, 800, 700, 400, 2500, 7),
    Rillifane_Rallathil("Sorcerers", 1300, 750, 450, 500, 2500, 9),
    Segojan_Earthcaller("Sorcerers", 900, 800, 500, 650, 2500, 5),
    Skye_Soar("Sorcerers", 1000, 700, 400, 500, 2500, 5),
    Eunoia_Cyn("Warriors", 400, 700, 800, 600, 2500, 6),
    Flandal_Steelskin("Warriors", 200, 750, 650, 700, 2500, 7),
    Gaerdal_Ironhand("Warriors", 100, 700, 500, 600, 1354, 7),
    Muamman_Duathall("Warriors", 300, 900, 500, 750, 2546, 6),
    Sehanine_Monnbow("Warriors", 600, 700, 800, 500, 2500, 8),
    Undefeated_Yoj("Warriors", 400, 800, 400, 700, 2500, 7);

    private final String heroType;
    private final int MP;
    private final int strength;
    private final int agility;
    private final int dexterity;
    private final int gold;
    private final int experience;

    HerosEnum(String heroType, int MP, int strength, int agility, int dexterity, int gold, int experience) {
        this.heroType = heroType;
        this.MP=MP;
        this.strength=strength;
        this.agility=agility;
        this.dexterity=dexterity;
        this.gold=gold;
        this.experience=experience;
    }

    public String getHeroType() {
        return heroType;
    }
    public int getMP(){return MP;}
    public int getStrength(){return strength;}
    public int getAgility(){return agility;}
    public int getDexterity(){return dexterity;}
    public int getGold(){return gold;}
    public int getExperience(){return experience;}

    public String getTextColor() {
        if (heroType == "Warriors") {
            //red
            return "\u001B[31m";
        } else if (heroType == "Sorcerers") {
            return "\u001B[34m";
        } else {
            return "\u001B[35m";
        }
    }

}
