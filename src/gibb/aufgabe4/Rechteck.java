package gibb.aufgabe4;

import gibb.Main;

public class Rechteck extends Figur{
    protected double breite;
    protected double hoehe;
    protected double flaeche;
    public Rechteck(double breite, double hoehe, int x, int y) {
        super(x,y);
        this.breite = breite;
        this.hoehe = hoehe;
        this.flaeche = breite*hoehe;
    }
    public void setBreite(int breite) {
        this.breite = breite;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return (int)this.breite;
    }

    public int getHoehe() {
        return (int)this.hoehe;
    }
    public double getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(double flaeche) {
        this.flaeche = breite*hoehe;
    }

}
