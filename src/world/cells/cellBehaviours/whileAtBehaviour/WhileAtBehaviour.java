package world.cells.cellBehaviours.whileAtBehaviour;

import character.hero.Hero;

import java.util.List;

//interface for strategy pattern implementation on while at behaviour
public interface WhileAtBehaviour {
    public String whileAt(List<Hero> party);
}
