package gibb.aufgabe4;

import java.awt.*;

public class Linie extends Figur{
    int endX;

    int endY;

    public Linie(int x, int y, int endX, int endY) {
        super(x, y);
        this.endX = endX;
        this.endY = endY;
    }
    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    @Override
    public double berechneFlaeche() {
        return 0;
    }

    @Override
    public void strecken(int vergroessern) {
        this.endX = endX*vergroessern;
    }

    @Override
    public void zeichne(Graphics g) {
        g.drawLine(x, y, getEndX(), getEndY());
    }
}
