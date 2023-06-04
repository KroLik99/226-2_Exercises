package gibb.aufgabe4;

import java.awt.*;

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

    @Override
    public void drehen(int drehpunktX, int drehpunktY) {

    }

    @Override
    public double berechneFlaeche(){
        return radius*radius*Math.PI;
    }

    @Override
    public void strecken(int vergroessern) {
        this.radius = radius*vergroessern;
    }

    @Override
    public void zeichne(Graphics g){
        int x = getX() - getRadius();
        int y = getY() - getRadius();
        g.drawOval(x, y, getRadius(), getRadius());
    }
}
