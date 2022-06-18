package shapes;

public class Rectangle implements Shape{
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("I draw a rectangle with length = "+length+", width"+width);
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
