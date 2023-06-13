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
        //When
        kreis.zeichne(graphics);
        //Then
        Assert.assertEquals(1, graphics.numberOfCalls);
        Assert.assertEquals(60-25, graphics.x);
        Assert.assertEquals(40-25, graphics.y);
        Assert.assertEquals(50, graphics.width);
        Assert.assertEquals(50, graphics.height);
    }
}
