package character.behavior.attack;

public class AttackWithOutWeapon implements Attack {
    @Override
    public int attack() {
        System.out.println("attack without weapon");
        return 0;
    }
}
