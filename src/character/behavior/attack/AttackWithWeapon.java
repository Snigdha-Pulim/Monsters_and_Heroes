package character.behavior.attack;

public class AttackWithWeapon implements Attack {
    @Override
    public int attack() {
        System.out.println("will attack with weapons");
        return 0;
    }
}
