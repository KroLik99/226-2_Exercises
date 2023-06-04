package gibb.aufgabe4.Editor;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// MouseEvents
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
