package gibb.aufgabe4.Editor;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/** Adapterklasse
 * Wenn ein key getyped gibt das event an editorcontrol weiter
 * addKeyListener(new EditorKeyAdapter(editorControl)); hier als new object registriert in editorframe
 */
public class EditorKeyAdapter extends KeyAdapter {
    private EditorControl editorControl;

    public EditorKeyAdapter(EditorControl editorControl) {
        this.editorControl = editorControl;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        editorControl.setFigurTyp(e.getKeyChar());
    }
}
