package item.spell;

import item.spell.spells.fireSpells.*;
import spell.spells.fireSpells.*;
import item.spell.spells.iceSpells.ArcticStorm;
import item.spell.spells.iceSpells.FrostBlizzard;
import item.spell.spells.iceSpells.IceBlade;
import item.spell.spells.iceSpells.SnowCannon;
import item.spell.spells.lightningSpells.ElectricArrows;
import item.spell.spells.lightningSpells.LightningDagger;
import item.spell.spells.lightningSpells.SparkNeedles;
import item.spell.spells.lightningSpells.ThunderBlast;

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
