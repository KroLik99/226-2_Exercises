package gibb.aufgabe4;

import java.awt.*;
import java.io.PrintWriter;

public class Rechteck extends Figur {
    protected int breite;
    protected int hoehe;

    public Rechteck(int x, int y, int breite, int hoehe) {
        super(x, y);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return this.breite;
    }

    public int getHoehe() {
        return this.hoehe;
    }

    @Override //Methodenüberschreibung
    public double berechneFlaeche() {
        return breite * hoehe;
    }

    @Override
    public void strecken(int vergroessern) {
        this.breite = breite * vergroessern;
        this.hoehe = hoehe * vergroessern;
    }

    @Override
    public void zeichne(Graphics g) {
        g.drawRect(x, y, breite, hoehe);
    }

    @Override
    public void save(PrintWriter pw) {
        pw.println("rechteck, " + x + ", " + y + ", " + breite + ", " + hoehe);
    } //Reihenfolge vom Konstruktor
}
