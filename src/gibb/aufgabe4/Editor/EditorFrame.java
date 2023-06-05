package gibb.aufgabe4.Editor;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EditorFrame extends JFrame {//standardbib für Fenster
  private EditorControl editorControl = new EditorControl(this);
  
  public EditorFrame(int breite, int hoehe) {
    erzeugeUndSetzeEditorPanel(); //erzeugt und platziert Panel (Zeichnungsfläche)
    fensterEinmitten(breite, hoehe);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    addKeyListener(new EditorKeyAdapter(editorControl)); //registriert die Events (Eventlistener) und gibt diese an editorControl
    //Mit addKeyListener wird der EditorKeyAdaptor zur Liste von Listener (vom JFRAMe) hinzugefügt
  }
/* Verschachtelte Klasse
  public class EditorMouseAdapter extends MouseAdapter {
    private EditorControl editorControl;

    public EditorMouseAdapter(EditorControl editorControl) {
      this.editorControl = editorControl;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      editorControl.erzeugeFigurMitZweitemPunkt(e.getPoint());
    }

    @Override
    public void mousePressed(MouseEvent e) {
      editorControl.setErsterPunkt(e.getPoint());
    }
  }*/
  private void erzeugeUndSetzeEditorPanel() {
    JPanel panel = new EditorPanel(editorControl); //ein neues panel vom Typ JPanel wird deklariert und einem neuen EditorPanel mit jeweiligen editorControl zugewiesen
    setContentPane(panel); //swing Basisklasse; panel wird zum Fenster platziert
  }

  private void fensterEinmitten(int breite, int hoehe) {
    Dimension bildschirmGroesse = Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle fensterAusschnitt = new Rectangle();
    fensterAusschnitt.width = breite;
    fensterAusschnitt.height = hoehe;
    fensterAusschnitt.x = (bildschirmGroesse.width - fensterAusschnitt.width) / 2;
    fensterAusschnitt.y = (bildschirmGroesse.height - fensterAusschnitt.height) / 2;
    setBounds(fensterAusschnitt);
  }
}
