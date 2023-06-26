package gibb.aufgabe4;

import java.awt.*;
import java.io.PrintWriter;

public class Kreis extends Figur {
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

    @Override
    public double berechneFlaeche() {
        return radius * radius * Math.PI;
    }

    @Override
    public void strecken(int vergroessern) {
        this.radius = radius * vergroessern;
    }

    @Override
    public void zeichne(Graphics g) {
        int x = getX() - getRadius();
        int y = getY() - getRadius();
        g.drawOval(x, y, getRadius()*2, getRadius()*2);
    }

    @Override
    public void save(PrintWriter pw) {
        pw.println("kreis, " + x + ", " + y + ", " + radius);
    }
}
