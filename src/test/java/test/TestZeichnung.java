package test;

import gibb.aufgabe4.Kreis;
import gibb.aufgabe4.Linie;
import gibb.aufgabe4.Rechteck;
import gibb.aufgabe4.Zeichnung;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.awt.*;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class TestZeichnung {
    @Test
    public void zeichneFigurenMockitoAnzahlAufrufe() {
        //Prüft den Aufruf von den Methoden und die Argumente
        //GIVEN
        Zeichnung zeichnung = new Zeichnung();
        zeichnung.hinzufuegen(new Rechteck(60, 50, 10, 50));
        zeichnung.hinzufuegen(new Linie(60, 50, 10, 50));
        zeichnung.hinzufuegen(new Kreis(60, 50, 10));
        Graphics g = mock(Graphics.class);

        //WHEN
        zeichnung.zeichneFiguren(g);
        //THEN
        Mockito.verify(g, Mockito.times(1)).drawOval(50, 40, 20, 20);
        Mockito.verify(g, Mockito.times(1)).drawLine(60, 50, 10, 50);
        Mockito.verify(g, Mockito.times(1)).drawRect(60, 50, 10, 50);
    }
    @Test
    public void zeichneFigurenMockObjekt() { //Prüft den Methodenaufruf in order und die Argumente
        //GIVEN
        Zeichnung zeichnung = new Zeichnung();
        zeichnung.hinzufuegen(new Rechteck(60, 50, 10, 50));
        zeichnung.hinzufuegen(new Linie(60, 50, 10, 50));
        zeichnung.hinzufuegen(new Kreis(60, 50, 10));
        Graphics g = mock(Graphics.class);

        //WHEN
        zeichnung.zeichneFiguren(g);

        //THEN
        InOrder inOrder = inOrder(g);
        inOrder.verify(g).drawRect(60, 50, 10, 50);
        inOrder.verify(g).drawLine(60, 50, 10, 50);
        inOrder.verify(g).drawOval(50, 40, 20, 20);
    }
}
