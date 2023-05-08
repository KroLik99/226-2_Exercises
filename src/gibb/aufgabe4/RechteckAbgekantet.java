package gibb.aufgabe4;

public class RechteckAbgekantet extends Rechteck{
    private int kante;

    @Override //Methodenüberschreibung
    public double berechneFlaeche() {
        return super.berechneFlaeche() - 2 * kante * kante;
    }

    public RechteckAbgekantet(int breite, int hoehe, int x, int y, int kante) {
        super(breite, hoehe, x, y); //wird an den Konstruktor der Superklasse weitergegeben
        this.kante = kante;
    }
}
