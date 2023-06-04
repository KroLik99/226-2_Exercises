package gibb.aufgabe4;


import java.awt.*;
import java.util.List;

public class Zeichnung {
    private List<Figur> figuren; //kennt alle Figuren (Attribut)
    private Display display;

    public Zeichnung(Display display) {
        this.figuren = arrFiguren;
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

    }
}
/*zeichnung.hinzufuegen(new Rechteck(200, 300, 20, 20));
        zeichnung.hinzufuegen(new Linie(70, 40, 20, 150));
        zeichnung.hinzufuegen(new Kreis(300, 400, 180));
        zeichnung.hinzufuegen(new Dreieck(400, 170, 100, 160, 190, 150));*/