package gibb.aufgabe4.io;

import gibb.aufgabe4.Figur;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InaccessibleObjectException;
import java.util.List;

public class FigureSaver {
    private File file;

    public FigureSaver(File f) { //Konstruktor
        this.file = f;
    } //

    public void save(List<Figur> figuren) {
        try (FileWriter fw = new FileWriter(file); //allgemein um in ein File zu schreiben
             PrintWriter pw = new PrintWriter(fw)) {
            for (Figur figur : figuren) {
                figur.save(pw);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
