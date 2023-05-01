package gibb;

import gibb.aufgabe4.Figur;
import gibb.aufgabe4.Kreis;
import gibb.aufgabe4.Rechteck;

public class Main {
    public static void main(String[] args) {
        Rechteck r = new Rechteck(100, 20, 40, 50);

        Figur f = new Figur(45, 50);

        Kreis k = new Kreis();
        f = k;
        f.x = 65;
        //f.radius = 70; radius ist keine Instanzvariable in der Klasse Figuren
        f = new Rechteck(27,42, 103, 207);
        //r = f; selbst wenn zur Laufzeit ein Referenztyp Rechteck im f gepeichert ist, kann dies nicht konvertiert werden

    }
}
