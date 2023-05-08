package gibb.aufgabe4;

public abstract class Figur {
    protected int x, y;


    public Figur(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    public abstract double berechneFlaeche(); //nur deklariert aber nicht implementiert, weil wir nicht wissen welche Figur
}
