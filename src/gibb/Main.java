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
        RechteckAbgekantet abgekantet = new RechteckAbgekantet(500, 100, 100, 50, 50);
        System.out.println(abgekantet.berechneFlaeche());
        Rechteck r = abgekantet;
        System.out.println(r.berechneFlaeche());
        Figur f = abgekantet;
        f.berechneFlaeche(); //geht nicht ohne deklaration im Figur (abstrakt);Dynamische Methodenbindung: Der Methodenaufruf wird zur Laufzeit an die korrekte Methode gebunden; Polymorphe Variabeln: Referenzen, die als Typ die Basisklasse haben, die zur Laufzeit mit Objekten von abgeleiteten Klassen haben.
        Figur[] arrayFiguren = new Figur[]{
                new RechteckAbgekantet(300, 320, 560, 430, 10),
                new Rechteck(120, 200, 300, 600),
                new Kreis(470, 340, 60)
        };
        for(Figur i : arrayFiguren){ //wenn neue Figur Klasse hinzugefügt (Rhombus) dann braucht es kein if(i instanceof Rhombus) sondern es geht so:
            System.out.println(i.berechneFlaeche());
        }
    }
}
