package gibb.aufgabe4.io;

import gibb.aufgabe4.Figur;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.InaccessibleObjectException;
import java.util.List;

public class FigureSaver {
    private File file;
    public void FigurSaver(File f){
        this.file = file;
    }
    public void save(List<Figur> figuren){
        try(FileWriter fw = new FileWriter(file)); //allgemein um in ein File zu schreiben
        PrintWriter pw = new PrintWriter(fileWriter);{
            for (Figur figur: figuren
                 ) { Figur.saver(printWriter);

            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }

    }
    public void saver(Figur f, PrintWriter pw){

    }
}
