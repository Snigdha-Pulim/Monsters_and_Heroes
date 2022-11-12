package world.cells.cellBehaviours.accessibilityBehaviour;

//strategy pattern class for Inaccessible space for accessibility behaviour
public class Inaccessible implements AccessibilityBahaviour{
    @Override
    public boolean accessibility() {
        return false;
    }
}
