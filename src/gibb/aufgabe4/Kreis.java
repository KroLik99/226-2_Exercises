package gibb.aufgabe4;

public class Kreis extends Figur{


    protected int radius;

    public Kreis(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
