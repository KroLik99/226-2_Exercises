package gibb.aufgabe4.test;

public class GraphicsStub extends ConcreteGraphics{
    int x;
    int y;
    int width;
    int height;
    int numberOfCalls;
    @Override
    public void drawOval(int x, int y, int width, int height) {
        numberOfCalls++;
        this.x=x;
        this.y=y;
        this.width= width;
        this.height=height;
    }
}
