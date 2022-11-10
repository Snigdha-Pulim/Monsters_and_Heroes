package character.hero;

public enum HerosEnum {
    Amaryllis_Astra ("Paladins"),
    Caliber_Heist ("Paladins"),
    Garl_Glittergold ("Paladins"),
    Parzival ("Paladins"),
    Sehanine_Moonbow ("Paladins"),
    Skoraeus_Stonebones ("Paladins"),
    Kalabar ("Sorcerers"),
    Reign_Havoc ("Sorcerers"),
    Reverie_Ashels ("Sorcerers"),
    Rillifane_Rallathil ("Sorcerers"),
    Segojan_Earthcaller ("Sorcerers"),
    Skye_Soar ("Sorcerers"),
    Eunoia_Cyn ("Warriors"),
    Flandal_Steelskin ("Warriors"),
    Gaerdal_Ironhand ("Warriors"),
    Muamman_Duathall ("Warriors"),
    Sehanine_Monnbow ("Warriors"),
    Undefeated_Yoj ("Warriors");

    private final String heroType;

    HerosEnum(String heroType) {
        this.heroType = heroType;
    }

    public String getHeroType() {
        return heroType;
    }

    public String getTextColor(){
        if(heroType=="Warriors"){
            //red
            return "\u001B[31m";
        }
        else if(heroType=="Sorcerers"){
            return "\u001B[34m";
        }
        else{
            return "\u001B[35m";
        }
    }

}
