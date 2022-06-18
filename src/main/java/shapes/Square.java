package shapes;

public class Square extends Rectangle{
    public Square(int  side) {
        super(side, side);
    }
    @Override
    public void draw(){
        System.out.println("I draw a Square with side = "+getWidth());
    }
}
