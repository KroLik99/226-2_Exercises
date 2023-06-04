package gibb.aufgabe4.Editor;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EditorPanel extends JPanel {
  private EditorControl editorControl;

  public EditorPanel(EditorControl control) {
    editorControl = control;
  }

  // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
  // Methode beim EditorFrame oder beim EditorPanel aufruft.
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    editorControl.allesNeuZeichnen(g);
  }
}