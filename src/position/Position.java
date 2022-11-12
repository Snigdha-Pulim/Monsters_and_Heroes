package position;

//stores the position of the party of heroes in the world
public class Position {
    public int x;
    public int y;
    public Position(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void changePosition(int x, int y){
        this.x=x;
        this.y=y;
    }
}
