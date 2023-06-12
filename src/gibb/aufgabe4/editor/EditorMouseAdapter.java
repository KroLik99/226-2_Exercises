package gibb.aufgabe4.editor;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Adapterklasse -> MouseEvents: Konstruktor vom EditorPanel registriert neues Objekt vom EditorMouseAdapter: addMouseListener(new EditorMouseAdapter(editorControl));
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
}
