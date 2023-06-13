package gibb.aufgabe4.Parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

public class FigurFileDAO implements FigurDAO {
  private BufferedReader in;

  public FigurFileDAO() {
    JFileChooser chooser = new JFileChooser();
    int openResult = chooser.showOpenDialog(null); //Fenster zum Auswählen des Files
    if (openResult == JFileChooser.APPROVE_OPTION) { //Bei Klick auf OK
      File file = chooser.getSelectedFile(); //in file wird die Datei gespeichert
      try {
        in = new BufferedReader(new FileReader(file)); //FileReader liest aus dem File und der BufferedReader kann Stückchenweise lesen
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
    }
  }

  public String[] readNextFigurData() {
    if (in != null) { //Eine Zeile wird ausgelesen und nach //s aufgetrennt
      try {
        String line = in.readLine();
        if (line != null && !line.isEmpty()) 
          return line.split("\\s");
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }
  
  public void close() {
    if (in != null) {
      try {
        in.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
