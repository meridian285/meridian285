package rectangle;

public class App {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5,9);
        rec.draw();

        Square s1 = new Square(5);
        s1.draw();

        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

    }
}
