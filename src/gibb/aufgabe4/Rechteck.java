package gibb.aufgabe4;

public class Rechteck extends Figur{
    protected int breite;
    protected int hoehe;
    public Rechteck(int breite, int hoehe, int x, int y) {
        super(x,y);
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
        return breite*hoehe;
    }
}
