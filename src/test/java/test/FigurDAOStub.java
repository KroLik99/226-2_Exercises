package test;

import gibb.aufgabe4.parser.FigurDAO;

import java.util.LinkedList;

public class FigurDAOStub implements FigurDAO {
    LinkedList<String[]> input;
    public FigurDAOStub(LinkedList<String[]> input) {
        this.input = input;
    }

    @Override
    public String[] readNextFigurData() {
        if(input.isEmpty()){
            return null;
        }
        return input.remove(0); //muss wissen was für ein Datentyp in der Liste ist (Generics)
    }
}
