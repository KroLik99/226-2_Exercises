package gibb;

import gibb.aufgabe4.*;

public class Main {
    public static final Display display = new Display(); //Static = Klassenvariabel

    public static void main(String[] args) {
       // Main.display.allesLoeschen();
       // => display.allesLoeschen();
        display.hinzufuegen(new Rechteck(200, 300, 20, 20));
        display.hinzufuegen(new Linie(70, 40, 20, 150));
        display.hinzufuegen(new Kreis(300, 400, 180));

    }
}
