package gibb.aufgabe4.Parser;

import gibb.aufgabe4.Figur;
import gibb.aufgabe4.Kreis;
import gibb.aufgabe4.Linie;
import gibb.aufgabe4.Rechteck;

import java.util.ArrayList;
import java.util.List;

public class FigurParser { //Abspeichern der eingelesenen Daten
  private FigurDAO dao; //Data Access Object
  //Dao greift auf File/DB/Webservice zu

  public FigurParser(FigurDAO dao) {
    this.dao = dao;
  } //Anstatt von FigurFileDao ist ein Objekttyp des Interface

  public List<Figur> parse() {
    List<Figur> figuren = new ArrayList<Figur>();
    String[] figurData = dao.readNextFigurData();
    while (figurData != null) {
      String figurTyp = figurData[0];
      int x = Integer.valueOf(figurData[1]);
      int y = Integer.valueOf(figurData[2]);
      switch (figurTyp) {
      case "Rechteck":
        int breite = Integer.valueOf(figurData[3]);
        int hoehe = Integer.valueOf(figurData[4]);
        figuren.add(new Rechteck(x, y, breite, hoehe));
        break;
      case "Kreis":
        int radius = Integer.valueOf(figurData[3]);
        figuren.add(new Kreis(x, y, radius));
        break;
      case "Linie":
        int endx = Integer.valueOf(figurData[3]);
        int endy = Integer.valueOf(figurData[4]);
        figuren.add(new Linie(x, y, endx, endy));
        break;
      }
      figurData = dao.readNextFigurData();
    }
    return figuren;
  }
}
