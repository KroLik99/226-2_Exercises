package gibb.aufgabe4;


import gibb.aufgabe4.io.FigureLoader;
import gibb.aufgabe4.io.FigureSaver;

import java.awt.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Zeichnung { //Hat Figuren
    private List<Figur> figuren; //kennt alle Figuren (Attribut)
    private Display display; //Macht ein Fenster

    public Zeichnung(Display display) { //Konstruktor
        this.figuren = new ArrayList<>(); //Alle Figuren die es gibt (ist noch leer)
        this.display = display; //Gibt die Infos für ein Fenster
        display.setZeichnung(this); //Zeichnung gibt sich an Display weiter
    }

    //ein Objekt soll alle Aufgaben wahrnehmen wo es alle notwendigen Infos hat -> Delegation an die Figurobjekte
    public void zeichneFiguren(Graphics g) { // erweiterbar wenn eine neue Klasse hinzukommt
        for (Figur f : figuren) {
            f.zeichne(g);
        }
    }

    public void move(int dx, int dy) {
    }

    /**
     * F�gt eine weitere Figur hinzu und l�st die Auffrischung des Fensterinhaltes aus.
     *
     * @param figur Referenz auf das weitere Figur-Objekt.
     */
    public void hinzufuegen(Figur figur) {
        figuren.add(figur);
        display.repaint();
    }

    /**
     * L�scht alle Figuren und l�st die Auffrischung des Fensterinhaltes aus.
     */
    public void allesLoeschen() {
        figuren.clear();
        //repaint();
        display.repaint();
    }
    public void save() {
        FigureSaver figurSaver = new FigureSaver(new File("out/save.txt"));
        figurSaver.save(figuren);
    }
    public void load() {
        FigureLoader figurLoader = new FigureLoader(new File("out/save.txt"));
        figuren = figurLoader.load();

        display.repaint();
    }
}
/*zeichnung.hinzufuegen(new Rechteck(200, 300, 20, 20));
        zeichnung.hinzufuegen(new Linie(70, 40, 20, 150));
        zeichnung.hinzufuegen(new Kreis(300, 400, 180));
        zeichnung.hinzufuegen(new Dreieck(400, 170, 100, 160, 190, 150));*/