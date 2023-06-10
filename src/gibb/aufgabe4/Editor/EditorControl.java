package gibb.aufgabe4.Editor;
/**
 * Steuert die Zeichnungen. Benötigt editorFrame für das repaint. Man könnte auch das Panel (Zeichnenfläcge) weiterzeichnen
 */

import gibb.aufgabe4.*;

import java.awt.Graphics;
import java.awt.Point;

public class EditorControl {
  private Zeichnung zeichnung;
  private EditorFrame editorFrame;
  private char figurTyp;
  private Point ersterPunkt;
// steuert die Funktionalität des GUI indem es den editorframe event nimmt und die event
  public EditorControl(EditorFrame editorFrame1){
    editorFrame=editorFrame1; //der EditorFrame (Fenster) wird zugewiesen zum mitgeteilten editorframe1
    //figurTyp = 'l'; //wird von EditorFrame mit EditorKeyAdapter gemacht
    zeichnung = new Zeichnung(); //Liste von allen Figuren
    /*zeichnung.hinzufuegen(new Rechteck(200, 300, 20, 20));
    zeichnung.hinzufuegen(new Linie(70, 40, 20, 150));
    zeichnung.hinzufuegen(new Kreis(300, 400, 180));
    zeichnung.hinzufuegen(new Dreieck(400, 170, 100, 160, 190, 150));*/
  }
  public void allesNeuZeichnen(Graphics g) {
    //alle Zeichnungen neu zeichnen
    zeichnung.zeichneFiguren(g);
  }

  public void setFigurTyp(char figurTyp) { //Single responsibility ist nur zuständig für die Steuerung der Events -> gibt dann die Funktionalität an die anderen Klassen weiter
    this.figurTyp = figurTyp;
    //Wenn taste s gedrückt, dann save der zeichnung
    if(figurTyp == 's'){
      zeichnung.save();
      System.out.println("Saved");
    }

    //Wenn taste o gedrückt, dann load der zeichnung
    if(figurTyp=='o'){
      zeichnung.allesLoeschen();
      zeichnung.load();
      editorFrame.repaint();
      System.out.println("loaded");
    }
  }

  public void setErsterPunkt(Point ersterPunkt) {
    this.ersterPunkt = ersterPunkt;
  }

  public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
    Figur figur = FigurFactory.create2(figurTyp, ersterPunkt, zweiterPunkt); //create2 erstellt die gezeichnete Figur
    if(figur != null){
      zeichnung.hinzufuegen(figur);
      editorFrame.repaint();
    }
  }
}
