package character.behavior.attack;

import character.Character;
//strategy pattern for different types of characters for their different types of attack ways
public interface Attack {
    public String attack(Character character);
}
