package chapter6;

public class ClassesAndObjects {

    public static void main(String[] args) {

        Rectangle bedroom = new Rectangle(7.1, 6.2);
        Rectangle livingRoom = new Rectangle(10.1, 5.2);

        System.out.println("Bedroom: " + bedroom.area());
        System.out.println("Living Room: " + livingRoom.area());

    }

}
