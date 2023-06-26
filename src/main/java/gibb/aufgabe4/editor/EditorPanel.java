package gibb.aufgabe4.editor;
/**
 * Kontrolliert die Events und gibt das weiter and EditorControl. Erstellt vom Frame
 */

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EditorPanel extends JPanel { //JPanel ist eine Java Basisklasse, die MouseListener Events bereitstellt.
  private EditorControl editorControl;

  public EditorPanel(EditorControl control) {
    editorControl = control;
    addMouseListener(new EditorMouseAdapter(editorControl)); //registriert alle Mouŝelisteners und gibt an editorControl weiter
  }

  // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
  // Methode beim EditorFrame oder beim EditorPanel aufruft. REPAINT wurde aufgerufen -> paintComponent(g)
  //graphics ist die Klasse um Sachen zu zeichnen -> drawOval usw.
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g); //java.awt Methode
    editorControl.allesNeuZeichnen(g);
  }
}