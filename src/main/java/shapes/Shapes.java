package shapes;

public class Shapes {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Shape c2 = new Circle(8);

        Rectangle r1 = new Rectangle(2,4);
        Shape r2 = new Rectangle(8,9);

        Shape s1 = new Square(7);
        Rectangle s2 = new Square(6);
        Shape s3 = new Square(2);

        Shape[] shapes = {c1,c2,r1,r2,s1,s2,s3};

//        for(Shape shape :shapes){
//            shape.draw();
//        }

        double totalArea = 0;
            for(Shape shape :shapes){
            totalArea = totalArea + shape.getArea();
        }
        System.out.println(totalArea);

    }
}
