package test;

import gibb.aufgabe4.Figur;
import gibb.aufgabe4.Kreis;
import gibb.aufgabe4.Linie;
import gibb.aufgabe4.Rechteck;
import gibb.aufgabe4.parser.FigurParser;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class FigurParserTest {
// Tests the FigurParser Class
    @Test
    public void testInputRechteck(){
        //Given
        LinkedList input = new LinkedList();
        input.add(new String[]{"Rechteck", "140", "200", "80", "67"});
        FigurDAOStub stub = new FigurDAOStub(input);
        FigurParser parser = new FigurParser(stub);
        //When
        List<Figur> figuren = parser.parse();
        //Then
        assertEquals(1, figuren.size());
        assertEquals(true, figuren.get(0) instanceof Rechteck);
        Rechteck rechteck = (Rechteck) figuren.get(0);
        assertEquals(140, rechteck.getX());
        assertEquals(200, rechteck.getY());
        assertEquals(80, rechteck.getBreite());
        assertEquals(67, rechteck.getHoehe());
    }
    @Test
    public void testInputKreis(){
        //Given
        LinkedList input = new LinkedList();
        input.add(new String[]{"Kreis", "50", "20", "80"});
        FigurDAOStub stub = new FigurDAOStub(input);
        FigurParser parser = new FigurParser(stub);
        //When
        List<Figur> figuren = parser.parse();
        //Then
        assertEquals(1, figuren.size());
        assertEquals(true, figuren.get(0) instanceof Kreis);
        Kreis kreis = (Kreis) figuren.get(0);
        assertEquals(50, kreis.getX());
        assertEquals(20, kreis.getY());
        assertEquals(80, kreis.getRadius());
    }
    @Test
    public void testInputLinie(){
        //Given
        LinkedList input = new LinkedList();
        input.add(new String[]{"Linie", "50", "20", "80", "70"});
        FigurDAOStub stub = new FigurDAOStub(input);
        FigurParser parser = new FigurParser(stub);
        //When
        List<Figur> figuren = parser.parse();
        //Then
        assertEquals(1, figuren.size());
        assertEquals(true, figuren.get(0) instanceof Linie);
        Linie linie = (Linie) figuren.get(0);
        assertEquals(50, linie.getX());
        assertEquals(20, linie.getY());
        assertEquals(80, linie.getEndX());
        assertEquals(70, linie.getEndY());
    }
    @Test
    public void testInputAllShapes(){
        //Given
        LinkedList input = new LinkedList();
        input.add(new String[]{"Linie", "50", "20", "80", "70"});
        input.add(new String[]{"Kreis", "50", "20", "80"});
        input.add(new String[]{"Rechteck", "140", "200", "80", "67"});
        FigurDAOStub stub = new FigurDAOStub(input);
        FigurParser parser = new FigurParser(stub);
        //When
        List<Figur> figuren = parser.parse();
        //Then
        assertEquals(3, figuren.size());
        assertEquals(true, figuren.get(0) instanceof Linie);
        assertEquals(true, figuren.get(1) instanceof Kreis);
        assertEquals(true, figuren.get(2) instanceof Rechteck);
        Linie linie = (Linie) figuren.get(0);
        assertEquals(50, linie.getX());
        assertEquals(20, linie.getY());
        assertEquals(80, linie.getEndX());
        assertEquals(70, linie.getEndY());
        Kreis kreis = (Kreis) figuren.get(1);
        assertEquals(50, kreis.getX());
        assertEquals(20, kreis.getY());
        assertEquals(80, kreis.getRadius());
        Rechteck rechteck = (Rechteck) figuren.get(2);
        assertEquals(140, rechteck.getX());
        assertEquals(200, rechteck.getY());
        assertEquals(80, rechteck.getBreite());
        assertEquals(67, rechteck.getHoehe());
    }
}
