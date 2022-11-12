package keyboardInput;

import character.hero.HeroFactory;
import character.hero.HerosEnum;

import java.util.Scanner;

//input methods class
public class KeyboardInput {

    //compares two strings
    public static boolean checkIfGivenString(String input,String toCheck) {
        if(input.equalsIgnoreCase(toCheck)) return true;
        return false;
    }

    //checks if the input value is [w,a,s,d]
    public static boolean checkIfwasd(String input) {
        if(input.equalsIgnoreCase("w"))
            return true;
        else if(input.equalsIgnoreCase("a"))
            return true;
        else if(input.equalsIgnoreCase("s"))
            return true;
        else if(input.equalsIgnoreCase("d"))
            return true;
        return false;
    }

}
