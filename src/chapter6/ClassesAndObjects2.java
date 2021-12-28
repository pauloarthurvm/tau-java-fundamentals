package chapter6;

public class ClassesAndObjects2 {

    public static void main(String[] args) {

        Rectangle kitchen = getRoom(5.0, 6.0);
        Rectangle bathroom = getRoom(4.0, 5.0);

    }

    static Rectangle getRoom(Double side1, Double side2) {
        return new Rectangle(side1, side2);
    }


    Rectangle getRoom() {
        return new Rectangle(1.0, 2.2);
    }

}
