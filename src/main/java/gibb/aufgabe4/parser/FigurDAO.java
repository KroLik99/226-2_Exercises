package gibb.aufgabe4.parser;
/**
 * interface zum Testen und Isolieren der FigurParser Klasse
 * Alle Methoden die notwendig sind um ein DAO zu implementieren, z.B. Close ist nicht notwendig, je nachdem was man macht.
 **/
public interface FigurDAO {

    String[] readNextFigurData(); //deklariert die Methode aus FigurFileDAO
}
