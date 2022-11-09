package character.monster;

import character.monster.monsters.dragons.*;
import character.monster.monsters.exoskeletons.*;
import character.monster.monsters.spirits.*;

import java.util.*;

public class MonstersFactory {
    public static final List<Monster> monsters=new ArrayList<Monster>();

    static {
        monsters.add(new Natsunomeryu());
        monsters.add(new BigBadWolf());
        monsters.add(new Blinky());
        monsters.add(new Casper());
        monsters.add(new Chrysophylax());
        monsters.add(new WickedWitch());
        monsters.add(new Andrealphus());
        monsters.add(new Desghidorrah());
        monsters.add(new Brandobaris());
        monsters.add(new Andromalius());
        monsters.add(new BunsenBurner());
        monsters.add(new Aasterinian());
        monsters.add(new ChiangShih());
        monsters.add(new Igneel());
        monsters.add(new Phaarthurnax());
        monsters.add(new Chronepsish());
        monsters.add(new DocOck());
        monsters.add(new Ereshkigall());
        monsters.add(new TheScaleless());
        monsters.add(new Cyrrollalee());
        monsters.add(new Melchiresas());
        monsters.add(new TheWeatherbe());
        monsters.add(new Kiaransalee());
        monsters.add(new Jormunngand());
        monsters.add(new DMaleficent());
        monsters.add(new BlueEyesWhite());
        monsters.add(new StYeenoghu());
        monsters.add(new Rakkshasass());
        monsters.add(new Alexstraszan());
        monsters.add(new Exodia());
        monsters.add(new Merrshaullk());
        monsters.add(new Taltecuhtli());
    }

    public Monster getMonster(int level) {
        Random r = new Random();
        List<Monster> tempMonsters=new ArrayList<Monster>();
        for (Monster monster : monsters){
            if(monster.getLevel()==level)
                tempMonsters.add(monster);
        }
        int random_value = r.nextInt(tempMonsters.size());
        return tempMonsters.get(random_value);
    }
}
