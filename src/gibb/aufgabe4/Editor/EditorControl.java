package gibb.aufgabe4.Editor;

import gibb.aufgabe4.*;

import java.awt.Graphics;
import java.awt.Point;

public class EditorControl {
  private Zeichnung zeichnung;
  private EditorFrame editorFrame;
  private char figurTyp;
  private Point ersterPunkt;

  public EditorControl(EditorFrame editorFrame1){
    editorFrame=editorFrame1;
    //figurTyp = 'l'; //wird von EditorFrame mit EditorKeyAdapter gemacht
    zeichnung = new Zeichnung();
    zeichnung.hinzufuegen(new Rechteck(200, 300, 20, 20));
    zeichnung.hinzufuegen(new Linie(70, 40, 20, 150));
    zeichnung.hinzufuegen(new Kreis(300, 400, 180));
    zeichnung.hinzufuegen(new Dreieck(400, 170, 100, 160, 190, 150));
  }
  public void allesNeuZeichnen(Graphics g) {
    //alle Zeichnungen neu zeichnen
    zeichnung.zeichneFiguren(g);
  }

  public void setFigurTyp(char figurTyp) {
    this.figurTyp = figurTyp;
  }

  public void setErsterPunkt(Point ersterPunkt) {
    this.ersterPunkt = ersterPunkt;
  }

  public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
    Figur figur = FigurFactory.create2(figurTyp, ersterPunkt, zweiterPunkt);
    if(figur != null){
    zeichnung.hinzufuegen(figur);
    editorFrame.repaint();
    }
  }
  private static void testSaveLoad(Zeichnung zeichnung) {
    zeichnung.save();
    sleep(1000);
    System.out.println("CLEAR");
    zeichnung.allesLoeschen();
    sleep(1000);
    System.out.println("LOAD");
    zeichnung.load();
  }

  private static void sleep(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
