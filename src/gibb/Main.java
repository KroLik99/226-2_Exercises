package gibb;

import gibb.aufgabe4.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       // Main.display.allesLoeschen();
       // => display.allesLoeschen();

        Display display = new Display();
        Zeichnung zeichnung = new Zeichnung(display);
        display.setZeichnung(zeichnung);
        zeichnung.hinzufuegen(new Rechteck(200, 300, 20, 20));
        zeichnung.hinzufuegen(new Linie(70, 40, 20, 150));
        zeichnung.hinzufuegen(new Kreis(300, 400, 180));
        zeichnung.hinzufuegen(new Dreieck(400, 170, 100, 160, 190, 150));

    }
    private void sleep(long millis){

    }
}
