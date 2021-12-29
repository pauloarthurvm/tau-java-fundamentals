package chapter11abstraction;

public class ShapeTestAbstraction {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(1.0, 3.4);
        rectangle.print();
        System.out.println(rectangle.calculateArea());

    }

}
