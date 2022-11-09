package character.hero;

import character.hero.heroes.Paladins.*;
import character.hero.heroes.Sorcerers.*;
import character.hero.heroes.Warriors.*;

public class HeroFactory {
    public static Hero getHero(HerosEnum herosEnum){
        switch (herosEnum){
            case Kalabar:
                return new Kalabar();
            case Parzival:
                return new Parzival();
            case Skye_Soar:
                return new SkyeSoar();
            case Eunoia_Cyn:
                return new EunoiaCyn();
            case Reign_Havoc:
                return new ReignHavoc();
            case Caliber_Heist:
                return new CaliberHeist();
            case Reverie_Ashels:
                return new ReverieAshels();
            case Undefeated_Yoj:
                return new UndefeatedYoj();
            case Amaryllis_Astra:
                return new AmaryllisAstra();
            case Gaerdal_Ironhand:
                return new GaerdalIronhand();
            case Garl_Glittergold:
                return new GarlGlittergold();
            case Muamman_Duathall:
                return new MuammanDuathall();
            case Sehanine_Monnbow:
                return new SehanineMonnbow();
            case Flandal_Steelskin:
                return new FlandalSteelskin();
            case Rillifane_Rallathil:
                return new RillifaneRallathil();
            case Segojan_Earthcaller:
                return new SegojanEarthcaller();
            case Skoraeus_Stonebones:
                return new SkoraeusStonebones();
            case Sehanine_Moonbow:
                return new SehanineMoonbow();
            default:
                return null;
        }
    }
}
