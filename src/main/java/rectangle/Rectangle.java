package rectangle;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
     }
     public int getArea(){
        return length*width;
     }
     public int getPerimeter(){
        return length+width;
     }
     public void draw(){
         System.out.println("I draw a red rectangle with width = "+width+", length = "+length);
     }
}
