package test;

import gibb.aufgabe4.Kreis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.*;

public class KreisTest {
    @Test
    public void drawOvalTest(){
        //Given
        Kreis kreis = new Kreis(60, 40, 25);
        GraphicsStub graphics = new GraphicsStub();
		// das Gleiche macht Mockito
		Graphics g = Mockito.mock(Graphics.class); //objekt von Graphics mit Mockito, macht ein g.drawOval() nach
        //When
        kreis.zeichne(graphics);
// mockito
		kreis.zeichne(g);
        //Then
        Assertions.assertEquals(1, graphics.numberOfCalls);
        Assertions.assertEquals(60-25, graphics.x);
        Assertions.assertEquals(40-25, graphics.y);
        Assertions.assertEquals(50, graphics.width);
        Assertions.assertEquals(50, graphics.height);
//mockito
		Mockito.verify(g, Mockito.times(1)).drawOval(60-25,40-25,50,50);
//Mockito.verify(g, Mockito.times(1)) returns a graphics object: macht alles was Assert macht
//Kreis Position vom Oval ist oben links und braucht den Durchmesser (breite und höhe)
 //stubs braucht es nicht mehr
   }
}
