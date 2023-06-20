package gibb.aufgabe4.test;

import gibb.aufgabe4.Kreis;
import org.junit.Assert;
import org.junit.Test;

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
		kreis.zeichne(g)
        //Then
        Assert.assertEquals(1, graphics.numberOfCalls);
        Assert.assertEquals(60-25, graphics.x);
        Assert.assertEquals(40-25, graphics.y);
        Assert.assertEquals(50, graphics.width);
        Assert.assertEquals(50, graphics.height);
//mockito
		Mockito.verify(g, Mockito.times(1)).drawOval(60-25,40-25,50,50);
//Mockito.verify(g, Mockito.times(1)) returns a graphics object: macht alles was Assert macht
//Kreis Position vom Oval ist oben links und braucht den Durchmesser (breite und höhe)
 //stubs braucht es nicht mehr
   }
}
