package gibb.aufgabe4.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FigureLoader {
    private File f;
    public FigureLoader(File f){
        this.f = f;
    }
    public List<Figur> load(){
        try{
            while(scanner.hasNext()){
            Scanner scanner = new Scanner(f);
            scanner.nextLine();}
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
