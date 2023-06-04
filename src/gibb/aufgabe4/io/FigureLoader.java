package gibb.aufgabe4.io;

import gibb.aufgabe4.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FigureLoader {
    private File file;
    public FigureLoader(File file){
        this.file = file;
    }
    public List<Figur> load(){
        ArrayList<Figur> figuren = new ArrayList<Figur>();
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) { //nextLine
                String nextline = scanner.nextLine(); //gibt string zurück
                Figur figur = addToArray(nextline);
                figuren.add(figur);
            }
        } catch (FileNotFoundException e){
            throw new RuntimeException(e); //wie break
        }
        return figuren;
    }

    private Figur addToArray(String nextline) {
        String[] elements = nextline.split(","); //teilt die linie beim , auf {kreis 300 300 10}
        String figurenTyp = elements[0].trim().toLowerCase();
        int[] numberParams = extrahiereParameter(elements); //wir wollen die x, y und weitere Params extrahieren und in int Array speichern
        return FigurFactory.create(figurenTyp, numberParams); //Factory Design Pattern
    }

    private int[] extrahiereParameter(String[] params) {
        int[] arrayParams = new int[params.length-1];
        for (int i = 1; i < params.length; i++) { //wir fangen nicht bei der Figur an, sondern beim ersten param {kreis, 300, 300, 100}
            arrayParams[i-1] = Integer.parseInt(params[i].trim()); //parseInt macht aus String int und ist eine statische Klassenmethode
        }
        return arrayParams;
    }
}
