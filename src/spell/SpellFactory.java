package spell;

import spell.spells.fireSpells.*;
import spell.spells.iceSpells.ArcticStorm;
import spell.spells.iceSpells.FrostBlizzard;
import spell.spells.iceSpells.IceBlade;
import spell.spells.iceSpells.SnowCannon;
import spell.spells.lightningSpells.ElectricArrows;
import spell.spells.lightningSpells.LightningDagger;
import spell.spells.lightningSpells.SparkNeedles;
import spell.spells.lightningSpells.ThunderBlast;

public class SpellFactory {
    public Spell getSpell(SpellsEnum spellsEnum){
        switch(spellsEnum){
            case breathOfFire:
                return new BreathOfFire();
            case flameTornado:
                return new FlameTornado();
            case heatWave:
                return new HeatWave();
            case hellStorm:
                return new HellStorm();
            case lavaComet:
                return new LavaComet();
            case arcticStorm:
                return new ArcticStorm();
            case frostBlizzard:
                return new FrostBlizzard();
            case iceBlade:
                return new IceBlade();
            case snowCannon:
                return new SnowCannon();
            case electricArrows:
                return new ElectricArrows();
            case lightningDagger:
                return new LightningDagger();
            case sparkNeedles:
                return new SparkNeedles();
            case thunderBlast:
                return new ThunderBlast();
            default:
                return null;
        }
    }
}
