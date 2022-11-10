package world.cells.accessibilityBehaviour;

public class Inaccessible implements AccessibilityBahaviour{
    @Override
    public boolean accessibility() {
        return false;
    }
}
