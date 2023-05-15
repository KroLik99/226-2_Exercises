package gibb.aufgabe4;


import java.awt.*;
import java.util.List;

public class Zeichnung {
    private List<Figur> figuren; //kennt alle Figuren (Attribut)

    public Zeichnung(List<Figur> arrFiguren) {
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
        //repaint();
    }

    /**
     * L�scht alle Figuren und l�st die Auffrischung des Fensterinhaltes aus.
     */
    public void allesLoeschen() {
        figuren.clear();
        //repaint();
    }
}
