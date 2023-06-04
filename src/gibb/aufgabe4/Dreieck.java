package gibb.aufgabe4;

import java.awt.*;

public class Dreieck extends Figur{
    protected int x1, x2;
    protected int y1, y2;

    public Dreieck(int x, int y, int x1, int x2, int y1, int y2) {
        super(x, y);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void drehen(int drehpunktX, int drehpunktY) {
        super.drehen(drehpunktX, drehpunktY);

    }

    @Override
    public double berechneFlaeche() {
        return (1.0/2.0)*Math.abs((x1-x)*(y1-y)+(x1-x2)*(y2-y1)+(x2-x)*(y2-y));
    }

    @Override
    public void strecken(int vergroessern) {
        int vergrössertesX = x*vergroessern;
        int vergrössertesX1 = x1*vergroessern;
        int vergrössertesX2 = x2*vergroessern;
        int vergrössertesY = y*vergroessern;
        int vergrössertesY1 = y1*vergroessern;
        int vergrössertesY2 = y2*vergroessern;
        this.x1 = vergrössertesX1;
        this.x2 = vergrössertesX2;
        this.y1 = vergrössertesY1;
        this.y2 = vergrössertesY2;
        this.x =vergrössertesX;
        this.y =vergrössertesY;
    }

    @Override
    public void zeichne(Graphics g) {
        int[] xPunkte = new int[]{x,x1,x2};
        int[] yPunkte = new int[]{y,y1,y2};
        g.drawPolygon(xPunkte,yPunkte,3);
    }
}
