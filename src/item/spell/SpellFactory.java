package item.spell;

import item.spell.spells.fireSpells.*;
import item.spell.spells.iceSpells.ArcticStorm;
import item.spell.spells.iceSpells.FrostBlizzard;
import item.spell.spells.iceSpells.IceBlade;
import item.spell.spells.iceSpells.SnowCannon;
import item.spell.spells.lightningSpells.ElectricArrows;
import item.spell.spells.lightningSpells.LightningDagger;
import item.spell.spells.lightningSpells.SparkNeedles;
import item.spell.spells.lightningSpells.ThunderBlast;

//spell factory/singleton class
public class SpellFactory {
    public static Spell getSpell(SpellsEnum spellsEnum){
        switch(spellsEnum){
            case BreathOfFire:
                return new BreathOfFire();
            case FlameTornado:
                return new FlameTornado();
            case HeatWave:
                return new HeatWave();
            case HellStorm:
                return new HellStorm();
            case LavaComet:
                return new LavaComet();
            case ArcticStorm:
                return new ArcticStorm();
            case FrostBlizzard:
                return new FrostBlizzard();
            case IceBlade:
                return new IceBlade();
            case SnowCannon:
                return new SnowCannon();
            case ElectricArrows:
                return new ElectricArrows();
            case LightningDagger:
                return new LightningDagger();
            case SparkNeedles:
                return new SparkNeedles();
            case ThunderBlast:
                return new ThunderBlast();
            default:
                return null;
        }
    }
}
