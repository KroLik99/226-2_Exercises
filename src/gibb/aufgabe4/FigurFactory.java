package gibb.aufgabe4;

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
}
