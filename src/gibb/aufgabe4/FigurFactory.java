package gibb.aufgabe4;

import java.awt.*;

public class FigurFactory {
    public static Figur create(String figurenTyp, int[] numberParams){
        switch (figurenTyp){ //nicht einfach erweiterbar; Figur weiss welche Figur sie ist und kann daher eine neue Figur machen.
            case "dreieck": {
                return new Dreieck(numberParams[0], numberParams[1], numberParams[2], numberParams[3], numberParams[4], numberParams[5]);
            }
            case "kreis": {
                return new Kreis(numberParams[0], numberParams[1], numberParams[2]);
            }
            case "linie": {
                return new Linie(numberParams[0], numberParams[1], numberParams[2], numberParams[3]);
            }
            case "rechteck":{
                return new Rechteck(numberParams[0], numberParams[1], numberParams[2], numberParams[3]);
            }
            default: {
                throw new RuntimeException("Das hat nicht geklappt!");
            }
        }
    }

    public static Figur create2(char figurTyp, Point ersterPunkt, Point zweiterPunkt) {
        switch (figurTyp){ //nicht einfach erweiterbar; Figur weiss welche Figur sie ist und kann daher eine neue Figur machen.
            case 'r': { //Rechteck
                int breite = Math.abs(zweiterPunkt.x - ersterPunkt.x); //absoluter Wert weil wenn man Werte negative hat, dann gibt es  keinen negativen Wert (wenn man die Maus rückwörts zeht)
                int hoehe = Math.abs(zweiterPunkt.y - ersterPunkt.y);
                int linkesX = Math.min(ersterPunkt.x, zweiterPunkt.x);
                int oberesY = Math.min(ersterPunkt.y, zweiterPunkt.y);
                return new Rechteck(linkesX, oberesY, breite, hoehe);
            }
            case 'k': {
                //Kreis
                int differenzX = zweiterPunkt.x- ersterPunkt.x;
                int differenzY = zweiterPunkt.y-ersterPunkt.y;
                int radius = (int) Math.round(Math.sqrt(differenzX*differenzX+differenzY*differenzY)); //brauccht kein absoluten Wert, weil beim Quadrieren geht das weg
                return new Kreis(ersterPunkt.x, ersterPunkt.y, radius);
            }
            case 'l': { //Linie
                return new Linie(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y);
            }
            default: { //Dreieck
                System.err.println("Ungültige Eingabe: wir akzeptieren auch keine Dreiecke!");
                return null;
            }
        }
    }
}
