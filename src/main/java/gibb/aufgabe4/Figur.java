package gibb.aufgabe4;

import java.awt.*;
import java.io.PrintWriter;

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
    public void spiegeln(){
        this.x = x;
        this.y = y;
    };
    public void drehen(int drehpunktX, int drehpunktY){
        int xVerschoben = x - drehpunktX;
        int yVerschoben = y - drehpunktY;
        //jetzt drehen wir alles
        int xGedreht = yVerschoben;
        int yGedreht = -xVerschoben;
        x = xGedreht + drehpunktX;
        y = yGedreht + drehpunktY;
    };
    public abstract double berechneFlaeche(); //nur deklariert aber nicht implementiert, weil wir nicht wissen welche Figur
    public abstract void strecken(int vergroessern);

    public abstract void zeichne(Graphics g);
    public abstract void save(PrintWriter pw);
}
